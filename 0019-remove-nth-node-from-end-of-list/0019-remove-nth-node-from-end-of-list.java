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
        ListNode ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        if (count < n) {
            return null;
        }
        int Idx = count - n;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ptr=dummy;
        for (int i = 0; i < Idx; i++) {
            ptr = ptr.next;
        }

        ptr.next = ptr.next.next;

        return dummy.next;
    }
}