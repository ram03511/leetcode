class Solution {
    public int calPoints(String[] op) {
        ArrayDeque<Integer> ans = new ArrayDeque<>();
        int sum = 0;
        int num = 0;
        for (String ch : op) {
            if (ch.equals("D")) {
                int x = 2 * ans.peek();
                ans.push(x);
                num += x;
            } else if (ch.equals("C")) {
                num -= ans.peek();
                ans.pop();
            } else if (ch.equals("+")) {
                int i = ans.peek();
                ans.pop();
                int y = i + ans.peek();
                ans.push(i);
                ans.push(y);
                num += y;
            } else {
                int n = Integer.parseInt(ch);
                ans.push(n);
                num += n;
            }
        }
        for (int val : ans) {
            sum += val;
        }
        return sum;
    }
}