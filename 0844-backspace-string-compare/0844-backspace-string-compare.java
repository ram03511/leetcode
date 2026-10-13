class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#')
                x.append(s.charAt(i));
            else if (x.length() > 0) {
                x.deleteCharAt(x.length() - 1);
            }
        }
        StringBuilder y = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#')
                y.append(t.charAt(i));
            else if (y.length() > 0) {
                y.deleteCharAt(y.length() - 1);
            }
        }
       return x.toString().equals(y.toString());
    }
}