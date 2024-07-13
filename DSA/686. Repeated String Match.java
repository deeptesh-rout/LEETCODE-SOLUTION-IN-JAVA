class Solution {
    public int repeatedStringMatch(String a, String b) {
        int c = 0;
        String s = "";
        while(s.length()<b.length()+(2*a.length())){
            s = s + a;
            c++;
            if(s.contains(b)){
                return c;
            }
        }
        return -1;
    }
}
