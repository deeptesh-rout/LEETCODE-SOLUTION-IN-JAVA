class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++){
            sum = sum + binarySearch(grid[i]);
        }
        return sum;
    }
    public int binarySearch(int[] mat){
        int start = 0;
        int end = mat.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mat[mid] < 0){
                end = mid - 1;
            }else if(mat[mid] >= 0){
                start = mid + 1;
            }
        }
        return mat.length - start;
    }
}
