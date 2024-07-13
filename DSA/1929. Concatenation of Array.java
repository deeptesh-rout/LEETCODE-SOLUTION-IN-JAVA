import java.util.*;
class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        for(int i = 0; i<n; i++){
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        getConcatenation(nums);

        sc.close();
    }
}
