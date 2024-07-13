class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n+1];
        arr[0] = 0;
        int sum = 0;
        for(int i = 1; i<arr.length; i++){
            sum = sum + gain[i-1];
            arr[i]=sum;
        }
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
