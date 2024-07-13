import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length-1];
        while(start < end){
            int mid = start + (end - start)/2;
            if(isPossible(piles, h, mid)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public boolean isPossible(int[] piles, int h, int k){
        int time = 0;
        for(int i = 0; i < piles.length; i++){
            time = time + (piles[i] - 1)/k + 1;
            if(time > h){
                return false;
            }
        }
        return true;
    }
}
