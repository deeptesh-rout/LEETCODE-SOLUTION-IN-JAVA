class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 0;
        long end = (int)num;
        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid*mid == num){
               return true; 
            }
            if(mid*mid < num){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
