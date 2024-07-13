import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> h = new HashMap<Integer, Integer>();
        int b[] = arr.clone();
        Arrays.sort(b);
        int p = 1;
        for(int i = 0; i < b.length; i++){
            if(!h.containsKey(b[i])){
                h.put(b[i],p++);
            }
        }
        for(int j = 0; j < arr.length; j++){
            arr[j] = h.get(arr[j]);
        }
        return arr;
    }
}
