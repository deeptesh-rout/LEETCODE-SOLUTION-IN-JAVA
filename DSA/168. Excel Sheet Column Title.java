class Solution {
    public String convertToTitle(int n) {
        //try again
        String s = "";
        while(n > 0){
            char ch = (char)('A' + (n-1) % 26);
            s = ch + s;
            n = (n-1)/26;
        }
        return s;
    }
}
