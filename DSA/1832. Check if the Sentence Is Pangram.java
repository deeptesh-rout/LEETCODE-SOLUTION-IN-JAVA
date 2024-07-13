class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++){
            if(sentence.indexOf(alphabet.charAt(i)) == -1) return false;
        }
        
        return true;   
    }
}
