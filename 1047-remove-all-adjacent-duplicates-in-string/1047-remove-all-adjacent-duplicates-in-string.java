class Solution {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> ans = new ArrayDeque<>();
        StringBuilder x = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ans.isEmpty()){
                ans.push(ch);
            }else{
                char top = ans.peek();
                if(ch == top){
                    ans.pop();
                }else{
                    ans.push(ch);
                }
            }
        }
        for(char c : ans){
            x.append(c);
        }
        return x.reverse().toString();
    }
}