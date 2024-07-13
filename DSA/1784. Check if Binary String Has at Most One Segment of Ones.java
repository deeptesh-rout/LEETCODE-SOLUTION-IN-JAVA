class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 1 && s.charAt(0) == '1'){
            return true;
        }else if(s.length() == 1 && s.charAt(0) == '0'){
            return false;
        }
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                return false;
            }
        }
        return true;
    }
}
