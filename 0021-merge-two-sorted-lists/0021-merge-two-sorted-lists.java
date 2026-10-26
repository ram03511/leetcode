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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> ans = new ArrayList<>();
        if(list1 == null)return list2;
        if(list2 == null)return list1;
        ListNode temp = list1;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = list2;
        ListNode t = list1;
        while(t != null){
           ans.add(t.val);
           t = t.next;
        }
        Collections.sort(ans);
        ListNode x = list1;
        for(int i=0;i<ans.size();i++){
            x.val = ans.get(i);
            x = x.next;
        }
        return list1;
    }
}