class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while (temp1 != null) {
            ans1.add(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            ans2.add(temp2.val);
            temp2 = temp2.next;
        }
        ListNode x = l1;
        int carry = 0;
        int i = 0;
        while (i < ans1.size() || i < ans2.size()) {
            int a = (i < ans1.size()) ? ans1.get(i) : 0;
            int b = (i < ans2.size()) ? ans2.get(i) : 0;
            int sum = a + b + carry;
            x.val = sum % 10;
            carry = sum / 10;
            if (x.next == null &&
                (i + 1 < ans1.size() || i + 1 < ans2.size() || carry > 0)) {
                x.next = new ListNode(0);
            }
            x = x.next;
            i++;
        }
        if (carry > 0) {
            x.val = carry;
        }
        return l1;
    }
}