class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            st.add(nums1[i]);
        }
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){
            if(st.contains(nums2[i])){
                lst.add(nums2[i]);
            }
            st.remove(nums2[i]);
        }
        int[] arr = new int[lst.size()];
        for(int i = 0; i < lst.size(); i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}
