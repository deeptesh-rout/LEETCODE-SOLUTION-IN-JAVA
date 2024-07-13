class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid > 0 && mid < nums.length-1){
                if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                    return nums[mid];
                }
            }else{
                if(mid == 0 && nums[mid] != nums[mid+1]){
                    return nums[mid];
                }
                if(mid == nums.length-1 && nums[mid] != nums[mid-1]){
                    return nums[mid];
                }
            }
            if((mid % 2 == 0 && nums[mid] == nums[mid-1]) || (mid % 2 != 0 && nums[mid] == nums[mid+1])){
                end = mid - 1;
            }
            else if((mid % 2 == 0 && nums[mid] == nums[mid+1]) || (mid % 2 != 0 && nums[mid] == nums[mid-1])){
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
