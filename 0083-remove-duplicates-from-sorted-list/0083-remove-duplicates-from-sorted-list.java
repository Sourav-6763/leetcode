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
        if (head == null) {
            return null;
        }
        ListNode ptr = head;
        while (ptr != null) {
             ListNode next =ptr.next;
             while(next!=null && next.val==ptr.val){
                next=next.next;
             }
             ptr.next=next;
             ptr=ptr.next;
        }
        return head;
    }
}