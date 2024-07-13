class Solution {
    public int majorityElement(int[] nums) {
        int count;
        for(int i = 0; i < nums.length; i++){
            count = counting(nums, nums[i]);
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
    public int counting(int[] nums, int n){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(n == nums[i]){
                count++;
            }
        }
        return count;
    }
}
