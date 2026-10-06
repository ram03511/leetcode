class Solution {
    public int minAddToMakeValid(String s) {
      ArrayDeque<Character> ans = new ArrayDeque<>();
      for(int i=0;i<s.length();i++){
         char ch = s.charAt(i);
           if(ans.isEmpty()){
            ans.push(ch);
            }else if(ch == ')' && ans.peek() == '('){
            ans.pop();
            }else ans.push(ch);
        }
        return ans.size();
      }
}