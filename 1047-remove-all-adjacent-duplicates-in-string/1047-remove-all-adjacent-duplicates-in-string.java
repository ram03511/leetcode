class Solution {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> ans = new ArrayDeque<>();
        StringBuilder x = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = x.length();
            if(ans.isEmpty()){
                ans.push(ch);
                x.append(ch);
            }else{
                char top = ans.peek();
                if(ch == top){
                    ans.pop();
                    x.deleteCharAt(index-1);
                }else{
                    ans.push(ch);
                    x.append(ch);
                }
            }
        }
        return x.toString();
    }
}