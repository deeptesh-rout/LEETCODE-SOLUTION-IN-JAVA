class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        if(word1.length() == word2.length()){
            for(int i = 0; i < word1.length(); i++){
                s = s + word1.charAt(i) + word2.charAt(i);
            }
        }else if(word1.length() < word2.length()){
            int i;
            for(i = 0; i < word1.length(); i++){
                s = s + word1.charAt(i) + word2.charAt(i);
            }
            for(int j = i; j < word2.length(); j++){
                s = s + word2.charAt(j);
            }
        }else{
            int i;
            for(i = 0; i < word2.length(); i++){
                s = s + word1.charAt(i) + word2.charAt(i);
            }
            for(int j = i; j < word1.length(); j++){
                s = s + word1.charAt(j);
            }
        }
        return s;
    }
}
