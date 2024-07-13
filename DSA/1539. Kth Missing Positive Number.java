class Solution {
    public int findKthPositive(int[] arr, int k) {
        int a = 1;
        int count = 0;
        while(count != k){
            boolean check = true; 
            for(int i = 0; i < arr.length; i++){
                if(a == arr[i]){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
            }
            a++;   
        }
        return a-1;
    }
}
