class Solution {
    public String removeStars(String s) {
        StringBuilder x = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '*') x.append(s.charAt(i));
            else{
                if(x.length() == 0) continue;
                else x.deleteCharAt(x.length()-1);
            }
        }
        return x.toString();
    }
}