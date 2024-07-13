class Solution {
    public String restoreString(String s, int[] indices) {
        String str = "";
        int val = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < indices.length; j++){
                if(i == indices[j]){
                    val = j;
                    break;
                }
            }
            str = str + s.charAt(val);
        }
        return str;
    }
}
