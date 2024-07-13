class Solution {
    public int strStr(String haystack, String needle) {
        /*if(needle==" ") return 0;
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        else{
            return -1;
        }*/
        //without using built-in function
        int len1 = haystack.length();
        int len2 = needle.length();
        for(int  i = 0; i <= len1-len2; i++){
            int j;
            for(j = 0; j < len2; j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
            }
            if(j == len2){
                return i;
            }
        }
        return -1;
    }
}
