class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        List<Character> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ans.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
           if(ans.contains(t.charAt(i))){
              ans.remove(Character.valueOf(t.charAt(i)));
           }else{
            return false;
           }
        }
        return true;
    }
}