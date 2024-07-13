class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length - 1;
        while(start < matrix.length && end >= 0){
            if(matrix[start][end] == target){
                return true;
            }
            if(matrix[start][end] < target){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
}
