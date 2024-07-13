import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> list = new ArrayList <Integer>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(true){
            for(int k = left; k <= right; k++){
                list.add(matrix[top][k]);
            }
            top++;
            if(left > right || top > bottom) break;
            for(int p = top; p <= bottom; p++){
                list.add(matrix[p][right]);
            }
            right--;
            if(left > right || top > bottom) break;
            for(int m = right; m>=left; m--){
                list.add(matrix[bottom][m]);
            }
            bottom--;
            if(left > right || top > bottom) break;
            for(int n = bottom; n>=top; n--){
                list.add(matrix[n][left]);
            }
            left++;
            if(left > right || top > bottom) break;
        }
        return list;
    }
}
