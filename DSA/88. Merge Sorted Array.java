import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        int j = 0;
        for(int i = m; i < len; i++){
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }
}
