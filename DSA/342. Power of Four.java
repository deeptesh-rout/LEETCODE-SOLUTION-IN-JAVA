class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        int a = n/4;
        if(n != 4*a){
            return false;
        }
        return isPowerOfFour(a);
    }
}
