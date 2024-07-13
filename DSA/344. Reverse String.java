class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        System.out.println(Arrays.toString(reverse(s, i, j)));
    }
    public char[] reverse(char[] s, int i, int j){
        if(i >= j){
            return s;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return reverse(s, i+1, j-1);
    }
}
