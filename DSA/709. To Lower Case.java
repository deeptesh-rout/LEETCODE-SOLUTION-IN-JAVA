class Solution {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)((int)ch[i] + 32);
            }
        }
        String str = "";
        for(int i = 0; i < ch.length; i++){
            str = str + ch[i];
        }
        return str;
    }
}
