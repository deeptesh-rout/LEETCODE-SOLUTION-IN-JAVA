class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }else if(nums[mid] > nums[mid+1]){
                end = mid;
            }
        }
        return start;
    }
}
