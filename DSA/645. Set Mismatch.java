class Solution {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                return new int[]{arr[j], j+1};
            }
        }
        return new int[]{-1, -1};
    }
    public void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp; 
    }
}
