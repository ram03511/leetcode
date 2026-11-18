class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > k){
        StringBuilder x = new StringBuilder();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (count < k) {
                int num = ch - '0';
                sum += num;
                count++;
            }
            if (count == k || i == sb.length() - 1) {
                x.append(sum);
                sum = 0;
                count = 0;
            }
          }
          sb.replace(0, sb.length(), x.toString());
        }
        return sb.toString();
    }
}