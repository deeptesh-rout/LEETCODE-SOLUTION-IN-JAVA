class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int  i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> lst = new ArrayList<Integer>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                lst.add(index+1);
            }
        }
        return lst;
    }
    public void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
