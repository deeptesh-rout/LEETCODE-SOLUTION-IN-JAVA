class Solution {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int[] arr = new int[length];
        int p = 0;
        int q = n;
        for(int i = 0; i<length; i++){
            if(i % 2 == 0){
                arr[i] = nums[p];
                p++;
            }else{
                arr[i] = nums[q];
                q++;
            }
        }
        return arr;
    }
}
