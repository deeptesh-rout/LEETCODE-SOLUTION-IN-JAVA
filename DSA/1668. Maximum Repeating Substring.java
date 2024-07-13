class Solution {
    public int maxRepeating(String sequence, String word) {
        /*int len = word.length();
        String s ;
        int count = 0;
        for(int i = 0; i < sequence.length()-len+1; i++){
            s = sequence.substring(i, i+len);
            if(s.equals(word)){
                count++;
            }
        }
        return count;*/
        int ans = 1;
        // while (sequence.indexOf(word.repeat(ans)) >= 0)
        while (sequence.contains(word.repeat(ans)))
            ++ans;
        return ans - 1;
    }
}
