class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            rotate(mat);
            if(compare(mat, target)){
                return true;
            }
        }
        return false;
    }
    public void rotate(int[][] mat){
        //transpose
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //flip last and first col
        int start = 0;
        int end = mat.length - 1;
        while(start < end){
            for(int i = 0; i < mat.length; i++){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
    }
    public boolean compare(int[][] mat, int[][] target){
        int row = mat.length;
        int col = mat[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
