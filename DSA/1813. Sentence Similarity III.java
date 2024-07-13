class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length() == sentence2.length()){
            if(sentence1.equals(sentence2)){
                return true;
            }else{
                return false;
            }
        }

        String[] arr1=sentence1.split("\\s");
        String[] arr2=sentence2.split("\\s");
         
        int n1 = arr1.length;
        int n2 = arr2.length;

        int a1 = 0, a2 = 0;
        int b1 = n1-1, b2 = n2-1;

        while(n1 != 0 && n2 != 0 && arr1[a1].equals(arr2[a2])){
            n1--;
            n2--;
            a1++;
            a2++;
        }
        while(n1 != 0 && n2 != 0 && arr1[b1].equals(arr2[b2])){
            n1--;
            n2--;
            b1--;
            b2--;
        }
        return n1 == 0 || n2 == 0;
    }
}
