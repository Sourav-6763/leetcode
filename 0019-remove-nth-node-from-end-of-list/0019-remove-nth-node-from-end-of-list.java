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
        int Idx = count - n;
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ptr=dummy;
        if(count==1) return null;
        for (int i = 0; i < count; i++) {
            if(i==Idx){
                ptr.next=ptr.next.next;

            }
  else{
            ptr=ptr.next;
  }
        }
        return dummy.next;
    }
}