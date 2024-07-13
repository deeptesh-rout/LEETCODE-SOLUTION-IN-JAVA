class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int notrob = 0;
        for(int i = 0; i < nums.length; i++){
            int current = notrob + nums[i];
            notrob = Math.max(notrob, rob);
            rob = current;
        }
        return Math.max(notrob, rob);
    }
}
