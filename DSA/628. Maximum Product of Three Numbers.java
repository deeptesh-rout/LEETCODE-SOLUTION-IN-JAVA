import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i = 0; i < n-2; i++){
            int j = i+1, k = n-1;
            while(j < k){
                res = nums[i]*nums[j]*nums[k];
                if(max < res){
                    max = res;
                    j++;
                }else{
                    break;
                }
            }
        }
        return max;
    }
}
