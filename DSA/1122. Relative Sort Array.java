import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        int n = arr1.length;
        int m = arr2.length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr2[i] == arr1[j]){
                    lst.add(arr1[j]);
                }
            }
        }
        if(lst.size() != arr1.length) {
        	for(int i = 0; i < arr1.length; i++) {
        		if(!(lst.contains(arr1[i]))) {
        			lst1.add(arr1[i]);
        		}
        	}
        }
        Collections.sort(lst1);
        for(int i = 0; i < lst1.size(); i++) {
        	lst.add(lst1.get(i));
        }
        for(int i = 0; i < n; i++){
            arr1[i] = lst.get(i);
        }
        return arr1;
    }
}
