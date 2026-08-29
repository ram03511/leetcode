class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> ans = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!ans.contains(s.charAt(i))){
                ans.add(s.charAt(i));
            }
            else{
                return s.charAt(i);
            }
        }
        return '0';
    }
}