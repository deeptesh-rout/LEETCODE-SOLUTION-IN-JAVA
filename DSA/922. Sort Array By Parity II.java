class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        while(i<n && j<n){
            while(i < n && nums[i] % 2 == 0){
                i = i + 2;
            }
            while(j < n && nums[j] % 2 != 0){
                j = j + 2;
            }
            if(i<n && j<n){
                swap(nums, i, j);
            }
        }
        return nums;
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
