class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        if(list.size() >= 3)
            return list.get(list.size()-3);
        else
            return list.get(list.size()-1);
    }
}
