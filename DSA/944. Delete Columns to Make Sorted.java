class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        char[][] ch = new char[strs.length][n];
        for(int i = 0; i < ch.length; i++){
            for(int j = 0; j < n; j++){
                ch[i][j] = strs[i].charAt(j);
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < ch.length-1; j++){
                if(ch[j][i] > ch[j+1][i]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
