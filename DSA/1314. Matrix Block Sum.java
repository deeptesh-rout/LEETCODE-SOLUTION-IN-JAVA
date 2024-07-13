class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = sum(mat,i, j, k);
            }
        }
        return ans;
    }
    public int sum(int[][] mat, int i, int j, int k){
        int sum = 0;
        for(int r = i-k; r <= i+k; r++){
            for(int c = j-k; c <= j+k; c++){
                if(isValid(mat ,r, c)){
                    sum = sum + mat[r][c];
                }
            }
        }
        return sum;
    }
    public boolean isValid(int[][] mat, int r, int c){
        return (r >= 0 && r <= mat.length-1 && c >= 0 && c <= mat[0].length-1);
    }
}
