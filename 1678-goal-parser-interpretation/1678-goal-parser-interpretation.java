class Solution {
    public String interpret(String cmd) {
        StringBuilder s  = new StringBuilder();
        for(int i=0;i<cmd.length();i++){
            if(cmd.charAt(i) == 'G'){
                s.append("G");
            }else if(cmd.charAt(i) == '(' && cmd.charAt(i+1) == ')'){
                s.append("o");
            }else if(cmd.charAt(i) == '(' && cmd.charAt(i+1) == 'a'){
                s.append("al");
            }
        }
        return s.toString();
    }
}