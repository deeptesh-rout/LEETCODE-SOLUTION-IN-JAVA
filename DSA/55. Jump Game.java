class Solution {
    public boolean canJump(int[] nums) {
        // not for every case
        /*int n = nums.length;
        int p = -1;
        int i = 0;
        while(i < n){
            if(i == n-1){
                return true;
            }
            i += nums[i];
            if(p == i){
                break;
            }
            p = i;
        }
        return false;*/
        //copied
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i>max) {return false;}
            max = Math.max(nums[i]+i,max);
        }
        return true;
    }
}
