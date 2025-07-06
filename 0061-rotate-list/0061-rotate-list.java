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
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null ||head.next == null ) return head;

          int length = getLength(head);
        k = k % length;
        if (k == 0) return head;
        while (k --> 0) {
            ListNode ptr = head;
            ListNode newnode = new ListNode();
            ListNode prev=null;
            while (ptr != null) { 
                if (ptr.next == null) {
                    newnode.val = ptr.val;
                    prev.next=ptr.next;
                    break;
                }
                prev=ptr;
                ptr = ptr.next;

            }
            newnode.next = head;
            head = newnode;
            
        }
        return head;
    }
      private int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}