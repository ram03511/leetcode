class Solution {
    public String clearDigits(String s) {
        StringBuilder x = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) x.append(s.charAt(i));
            else x.deleteCharAt(x.length()-1);
        }
        return x.toString();
    }
}