class Solution {
    public int balancedStringSplit(String s) {
        int Rcount = 0;
        int Lcount = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                Rcount++;
            } else {
                Lcount++;
            }
            if (Rcount == Lcount) {
                ans++;
            }
        }
        return ans;
    }
}