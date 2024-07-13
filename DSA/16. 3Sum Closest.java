class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int min_diff = 0;
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                min_diff = Math.abs(sum - target);
                if(min_diff < min){
                    min = min_diff;
                    res = sum;
                }
                if(sum < target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }
}
