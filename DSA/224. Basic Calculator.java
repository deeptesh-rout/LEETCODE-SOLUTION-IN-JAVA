import java.util.Stack;

class Solution {
    public int calculate(String s) {
        Stack <Integer> stk = new Stack <Integer>();
        int num = 0;
        int res = 0;
        int sign = 1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + (int)(ch - '0');   
            }
            else if(ch == '+'){
                res = res + sign * num;
                num = 0;
                sign = 1;
            }
            else if(ch == '-'){
                res = res + sign * num;
                num = 0;
                sign = -1;
            }
            else if(ch == '('){
                stk.push(res);
                stk.push(sign);
                res = 0;
                sign = 1;
            }
            else if(ch == ')'){
                res = res + sign * num;
                num = 0;
                res = res * stk.pop();
                res = res + stk.pop();
            }
        }
        res = res + sign * num;
        return res;
    }
}
