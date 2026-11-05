/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int end = 0;
        while(temp != null){
            end++;
            temp = temp.next;
        }
        if(end == n) {
            return head.next;
        }
        ListNode x = head;
        for(int i=1;i<(end - n);i++){x = x.next;}
        x.next = x.next.next;
        return head;
    }
}