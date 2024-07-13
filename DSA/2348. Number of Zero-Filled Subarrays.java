class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
                ans = ans + count;
            }else{
                count = 0;
            }
        }
        return ans;
    }
}
