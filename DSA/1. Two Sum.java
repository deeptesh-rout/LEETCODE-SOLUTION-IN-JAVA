class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int sum = 0;
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                sum = nums[i]+nums[j];
                if(sum == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
