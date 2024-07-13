import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }
        
        List<List<Integer>> ans=new ArrayList();
        ans.add(new ArrayList());
        ans.add(new ArrayList());

        for(int nums:set1)
        {
            if(!set2.contains(nums))
                ans.get(0).add(nums);
        }
        for(int nums:set2)
        {
            if(!set1.contains(nums))
                ans.get(1).add(nums);
        }
        return ans;
    }
}
