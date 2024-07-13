import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min_diff = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            min_diff = arr[i+1] - arr[i];
            if(min_diff < min){
                min = min_diff;
            }
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] == min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list;
    }
}
