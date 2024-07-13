import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        int count = 1;
        int val = 0;
        for(int i = 0; i < arr.length; i=i+val){
            count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }else{
                    list.add(count);
                    break;
                }
            }
            val = count;
        }
        list.add(count);
        Set<Integer> set=new HashSet<>(list);
        return list.size()==set.size();
    }
}
