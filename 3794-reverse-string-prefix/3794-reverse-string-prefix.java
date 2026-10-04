class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder x = new StringBuilder(s.substring(0,k));
        x.reverse();
        String ans = x.toString()+s.substring(k);
        return ans;
    }
}