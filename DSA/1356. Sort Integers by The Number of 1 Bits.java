import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        // store the element and its 1-bits count
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = binary(arr[i]);
            a[i][1] = arr[i];
        }

        // Sort in increasing order of number of 1 bits
        // if number of 1 bits is same,
        // sort in increasing order of the element itself
        Arrays.sort(a, (x, y) ->
            (x[0] == y[0])? (x[1] - y[1]) : (x[0] - y[0])
        );

        // put the sorted elements back to the given array
        for (int i = 0; i < n; i++) {
            arr[i] = a[i][1];
        }

        return arr;
    }
    public int binary(int num){
        int count = 0;
        int rem = 0;
        while(num > 0){
            rem = num % 2;
            if(rem == 1){
                count++;
            }
            num = num / 2;
        }
        return count;
    }
}
