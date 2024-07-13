import java.util.Arrays;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int b = i * cols + j;
                ans[b][0] = i;
                ans[b][1] = j;
            }
        }
        Arrays.sort(ans, (a,b) ->{
            int d1 = Math.abs(rCenter - a[0]) + Math.abs(cCenter - a[1]);
            int d2 = Math.abs(rCenter - b[0]) + Math.abs(cCenter - b[1]);
            return d1-d2;
        });
        return ans;
    }
}
