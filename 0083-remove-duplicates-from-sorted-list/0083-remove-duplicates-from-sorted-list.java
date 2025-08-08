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
    public ListNode deleteDuplicates(ListNode head) {
         if(head ==null )return null;
        if(head.next==null) return head;
        ListNode cur = head;
        ListNode next = head;
        while (next != null) {
            cur = next;
            next = cur.next;
            while (next!=null && cur.val == next.val ) {
                next = next.next;
                cur.next = next;
            }
        }

        return head;
    }
}