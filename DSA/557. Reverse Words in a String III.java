class Solution {
    public String reverseWords(String s) {
        String[] arrOfStr = s.split(" ");
        String str = "";
        for (String a : arrOfStr){
            str = str + reverse(a) + " ";
        }
        return str.trim();
    }
    public String reverse(String s){
        String a = "";
        for(int i = s.length()-1; i >= 0; i--){
            a = a + s.charAt(i);
        }
        return a;
    }
}
