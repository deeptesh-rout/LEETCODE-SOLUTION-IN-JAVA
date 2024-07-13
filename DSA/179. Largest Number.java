import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i] + "";
        }
        Arrays.sort(arr, (a,b) ->{
            long n1 = Long.parseLong(a+b);
            long n2 = Long.parseLong(b+a);

            if(n2 > n1){
                return -1;
            }else if(n2 < n1){
                return 1;
            }else{
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder("");
        for(int i = arr.length-1; i >= 0; i--){
            sb.append(arr[i]);
        }
        if(sb.charAt(0) == '0'){
            return "0";
        }
        return sb.toString();
    }
}
