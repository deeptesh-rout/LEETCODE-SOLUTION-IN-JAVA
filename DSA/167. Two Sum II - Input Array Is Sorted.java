class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Test cases passed but time limit exceeded
        /*for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{-1, -1};*/
        int start = 0;
        int end = numbers.length - 1;
        while(numbers[start] + numbers[end] != target){
            if(numbers[start] + numbers[end] > target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{start+1, end+1};
    }
}
