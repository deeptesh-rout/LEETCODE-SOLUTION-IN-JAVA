class Solution {
    public String sortSentence(String s) {
       String[] arr = s.split(" ");
       String[] arr1 = new String[arr.length];
       int a;
       String str = "";
       for(int i = 0; i < arr.length; i++){
           a = (arr[i].charAt(arr[i].length()-1) - '0') - 1;
           arr1[a] = arr[i].substring(0, arr[i].length()-1);
       }
       for(int i = 0; i < arr1.length; i++){
           str = str + arr1[i] +" ";
       }
       return str.trim();
    }
}
