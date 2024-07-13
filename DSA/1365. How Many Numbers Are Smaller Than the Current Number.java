class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j!=i && nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}
