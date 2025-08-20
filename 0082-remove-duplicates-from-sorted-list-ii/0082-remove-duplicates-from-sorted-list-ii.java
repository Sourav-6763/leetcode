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
        if (head == null)
            return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ptr = head;
        ListNode prev = dummy;
        while (ptr != null) {
            ListNode next = ptr.next;
            if (next != null && ptr.val == next.val) {
                while (next != null && ptr.val == next.val) {
                    next = next.next;
                }
                ptr=next;
                prev.next=next;
            }
            else {
                prev=ptr;
                ptr=ptr.next;
            }

        }
        return dummy.next;
    }
}