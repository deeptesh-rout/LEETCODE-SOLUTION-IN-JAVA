class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int i = 0;
        int j = arr.length - 1;
        int a = 0;
        int b = 0;
        while(i != j && i < j){
            arr[i] = ++a;
            arr[j] = --b;
            i++;
            j--;
        }
        if(i == j){
            arr[i] = 0;
        }
        return arr;
    }
}
