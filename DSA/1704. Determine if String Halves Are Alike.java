class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length()/2;
        String str1 = "";
        String str2 = "";
        int count = 0;
        int cnt = 0;
        for(int i = 0; i < len; i++){
            str1 = str1+ s.charAt(i);
        }
        for(int i = len; i < s.length(); i++){
            str2 = str2 + s.charAt(i);
        }
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u' || str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U'){
                count++;
            }
        }
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u' || str2.charAt(i) == 'A' || str2.charAt(i) == 'E' || str2.charAt(i) == 'I' || str2.charAt(i) == 'O' || str2.charAt(i) == 'U'){
                cnt++;
            }
        }
        if(count == cnt){
            return true;
        }
        return false;
    }
}
