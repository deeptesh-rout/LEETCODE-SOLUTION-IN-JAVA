class Solution {
    int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        if(word.length() > m*n) return false;
        boolean check = false;
        int  i = 0;
        while(i < m){
            int j = 0;
            while( j < n){
                if(board[i][j] == word.charAt(0)){
                    check = findString(board, word, i, j, 0);
                }
                if(check){
                    return true;
                }else{
                    j++;
                }
            }
            i++;
        }
        return false;
    }
    public boolean findString(char[][] board, String word, int i, int j, int index){
        if(index == word.length() - 1) return true;
        for(int a = 0; a < dirs.length; a++){
            int[] dir = new int[dirs[0].length];
            dir[0] = dirs[a][0];
            dir[1] = dirs[a][1];
            int x = i + dir[0];
            int y = j + dir[1];
            if(isValid(board, x, y) && board[x][y] == word.charAt(index+1)){
                char temp = board[i][j];
                board[i][j] = '.';
                if(findString(board, word, x, y, index+1)) return true;
                board[i][j] = temp;
            }
        }
        return false;
    }
    public boolean isValid(char[][] board, int i, int j){
        return !(i<0 || j<0 || i>=board.length || j>= board[0].length);
    }
}
