class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String original = sb.toString();
        String reversed = sb.reverse().toString();
        return original.equals(reversed);
    }
}