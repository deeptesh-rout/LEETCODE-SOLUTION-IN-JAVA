class Solution {
    public int search(int[] nums, int target) {
        int pivotElement = pivot(nums);
        
        if(pivotElement == -1){
           return binarySearch(nums, target, 0, nums.length-1);    
        }
        
        if(nums[pivotElement] == target){
            return pivotElement;
        }
        
        int first = binarySearch(nums, target, 0, pivotElement - 1);
        if(first != -1){
            return first;
        }
        return binarySearch(nums, target, pivotElement+1, nums.length-1);
    }
    public int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
