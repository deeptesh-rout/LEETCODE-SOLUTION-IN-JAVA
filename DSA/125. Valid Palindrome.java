class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() < 2){
            return true;
        }
        s = s.toLowerCase();;
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                str = str + s.charAt(i);
            }
        }
        if(str == null || str.length() < 2){
            return true;
        }
        int i = 0;
        int j = str.length() - 1;
        boolean res = false;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                res = true;
                i++;
                j--;
            }else{
                return false;
            }
        }
        return res;
    }
}
