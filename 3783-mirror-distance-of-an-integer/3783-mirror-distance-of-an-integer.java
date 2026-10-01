class Solution {
    public int mirrorDistance(int n) {
        StringBuilder s = new StringBuilder(String.valueOf(n));
        int k = Integer.parseInt(s.reverse().toString());
        return Math.abs(k - n);
    }
}