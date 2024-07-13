class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] index = {-1, -1};
        
        index[0] = search(nums, target, true);
        if(index[0] != -1){
           index[1] = search(nums, target, false); 
        }
        
        return index;
    }
    public int search(int[] nums, int target, boolean firstindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(firstindex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
