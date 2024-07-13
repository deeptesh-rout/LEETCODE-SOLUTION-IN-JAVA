class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int a, b;
        for(int i = 0; i < s.length(); i++){
            a = check(s.charAt(i));
            if(i != s.length() - 1){
                b = check(s.charAt(i+1));
                if(a >= b){
                    sum = sum + a;
                }else{
                    sum = sum + b - a;
                    i++;
                }
            }else{
                sum = sum + a;   
            }
        }
        
        return sum;
    }
    public int check(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
