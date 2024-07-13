class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");
        if(pattern.length() != words.length){
            return false;
        }
        if(pattern.length() == 1){
            return true;
        }
        boolean a = false;
        for(int i = 0; i < pattern.length(); i++){
            for(int j = i+1; j < words.length; j++){
                if(pattern.charAt(i) == pattern.charAt(j)){
                    if(words[i].equals(words[j])){
                        a = true;
                    }else{
                        return false;
                    }
                }else {
                	if(words[i].equals(words[j])) {
                		return false;
                	}else {
                		a = true;
                	}
                }
            }
        }
        return a;
    }
}
