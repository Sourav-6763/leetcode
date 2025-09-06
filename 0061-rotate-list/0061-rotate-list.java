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
        if(head ==null ) return null;
        ListNode ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        // System.out.println(count);
        int n =k % count;
        ptr = head;
        ListNode prev = null;
        while (n > 0) {
            while (ptr.next != null) {
                prev = ptr;
                ptr = ptr.next;
            }
            prev.next = null;
            ptr.next = head;
            head = ptr;
            n--;
        }

        // System.out.println(prev.val);
        // System.out.println(ptr.val);
        return head;
    }
}