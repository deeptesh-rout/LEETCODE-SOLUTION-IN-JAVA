import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        int j = stones.length-1;
        while(j >= 1){
            sort(stones, 0, j);
            if(stones[j] == stones[j-1]){
                stones[j-1] = stones[j] - stones[j-1];
                j = j-2;
            }else{
                stones[j-1] = stones[j] - stones[j-1];
                j = j - 1;
            }
        }
        return stones[0];
    }
    public int[] sort(int[] arr, int l, int r){
        int[] temp = new int[r - l + 1];
        int j = 0;
        for (int i = l; i <= r; i++) {
            temp[j] = arr[i];
            j++;
        }
        Arrays.sort(temp);
        j = 0;
        for (int i = l; i <= r; i++) {
            arr[i] = temp[j];
            j++;
        }
        return arr;
    }
}
