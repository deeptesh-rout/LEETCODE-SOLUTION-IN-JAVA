class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        //not accepting all cases
        /*int a;
        
        if(k > n){
            a = n % k;
        }else{
            a = k;
        }
        
        int[] temp = new int[n];
        
        int j = 0;
        for(int i = n-a; i < n; i++){
            temp[j] = nums[i];
            j++;
        }
        for(int i = 0; i < n-a; i++){
            temp[j] = nums[i];
            j++;
        }
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }*/
        
        //time limit exceeded
        /*
        for(int i = 0; i < k; i++){
            int j, num;
            num = nums[n-1];
            for(j = n-1; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[j] = num;
        }*/
        
        if(nums.length <= 1){
            return;
        }
        //step each time to move
        int step = k % nums.length;
        int[] tmp = new int[step];
        for(int i = 0; i < step; i++){
            tmp[i] = nums[nums.length - step + i];
        }
        for(int i = nums.length - step - 1; i >= 0; i--){
            nums[i + step] = nums[i];
        }
        for(int i = 0; i < step; i++){
            nums[i] = tmp[i];
        }
    }
}
