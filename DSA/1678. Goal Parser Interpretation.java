class Solution {
    public String interpret(String command) {
        String s = "";
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                s = s + "G"; 
            }
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    s = s + "o";
                }else{
                    s = s + "al";
                }
            }
        }
        return s;
    }
}
