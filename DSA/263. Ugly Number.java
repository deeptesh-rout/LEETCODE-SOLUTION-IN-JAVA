class Solution {
    public boolean isUgly(int n) {
        int[] arr = {2, 3, 5};
        int a = arr.length;
        if(n <= 0){
            return false;
        }
        for(int i = 0; i < a; i++){
            while(n % arr[i] == 0){
                n = n/arr[i];
            }
        }
        return n == 1;
    }
}
