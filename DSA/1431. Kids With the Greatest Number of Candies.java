import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int n = candies.length;
        int max=Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0; i<n; i++){
            int sum = extraCandies + candies[i];
            if(sum >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}
