class Solution {
    public String freqAlphabets(String s) {
        int n = s.length() - 1;
        String str = "";
        int j = 0;
        while(n >= 0){
            if(s.charAt(n) != '#'){
                int a = 96 + Integer.parseInt(s.substring(n, n+1));
                str = (char)a + str;
                n--;
            }else{
                j = n - 2;
                int a = 96 + Integer.parseInt(s.substring(j, n));
                str = (char)a + str;
                n = j-1;
            }
        }
        return str;
    }
}
