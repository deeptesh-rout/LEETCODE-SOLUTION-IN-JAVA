class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] arr = new int[intervals.length];
        if(intervals.length == 1){
            arr[0] = -1;
            return arr;
        }

        for(int i = 0; i < intervals.length; i++){
            int flag = 0;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < intervals.length; j++){
                if(intervals[j][0] >= intervals[i][1] && min > intervals[j][0]){
                    min = intervals[j][0];
                    arr[i] = j;
                    flag = 1;
                }
            }
            if(flag != 1){
                arr[i] = -1;
            }
        }
        return arr;
    }
}
