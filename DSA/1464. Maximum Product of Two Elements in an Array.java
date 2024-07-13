import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res1 = (nums[0]-1)*(nums[1]-1);
        int res2 = (nums[n-2]-1)*(nums[n-1]-1);
        if(res1 > res2){
            return res1;
        }
        return res2;
    }
}
