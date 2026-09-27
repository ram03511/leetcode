class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count < k) {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}