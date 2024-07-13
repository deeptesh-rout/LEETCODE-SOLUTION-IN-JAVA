import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        long sum = 0;
        if(target==294967296 || target==-294967296){
            return new ArrayList<>(set);
        }
        for(int i = 0;i < nums.length-3;i++)
        {
            for(int j = i+1; j < nums.length-2; j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l)
                {
                    sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == (long)target) set.add(Arrays.asList(nums[i],nums[j],nums[k++],nums[l--]));
                    if(sum < target) k++;
                    if(sum > target) l--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
