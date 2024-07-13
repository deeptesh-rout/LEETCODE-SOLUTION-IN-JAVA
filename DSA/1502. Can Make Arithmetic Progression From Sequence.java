class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int gap = (max-min)/(arr.length-1);
        if(max - min != gap * (arr.length - 1)) return false;
        int num = 0;
        boolean res = false;
        for(int i = 0; i < list.size(); i++){
            num = min + i*gap;
            if(list.contains(num)){
                res = true;
            }else{
                return false;
            }
        }
        return res;
    }
}
