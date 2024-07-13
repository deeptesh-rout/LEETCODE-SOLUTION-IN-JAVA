class Solution {
    public String reversePrefix(String word, char ch) {
        int a = 0;
        int b = word.indexOf(ch);
        char[] ch1 = word.toCharArray();
        while(a < b){
            char temp = ch1[a];
            ch1[a] = ch1[b];
            ch1[b] = temp;
            a++;
            b--;
        }
        String s = new String(ch1);
        return s;
    }
}
