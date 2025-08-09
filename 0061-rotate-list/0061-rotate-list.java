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
        if(head==null)return null;
        ListNode ptr2=head;
        int count=0;
        while(ptr2!=null){
            count++;
            ptr2=ptr2.next;
        }
        int length=k%count;
        for (int i = 0; i < length; i++) {
            ListNode ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ListNode last = ptr.next;
            ptr.next = null;
            last.next = head;
            head = last;

        }
        return head;
    }
}