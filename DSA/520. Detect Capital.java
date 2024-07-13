class Solution {
    public boolean detectCapitalUse(String word) {
        String str = word;
        if(str.toUpperCase().equals(word)){
            return true;
        }else if(str.toLowerCase().equals(word)){
            return true;
        }else if(capitalize(str).equals(word)){
            return true;
        }else{
            return false;
        }
    }
    public String capitalize(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();  
    }  
}  
