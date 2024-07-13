import java.util.*;
class Solution {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            sum = sum + nums[i];
            arr[i] = sum;
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
        runningSum(nums);
}
}
