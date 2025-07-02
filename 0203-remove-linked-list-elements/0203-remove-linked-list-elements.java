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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
         ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev=dummy;
        ListNode current=dummy;
        while(current!=null){
            ListNode next=current.next;
            if(val==current.val){
                prev.next=next;
                current=next;
            }
            else{
            prev=current;
            current=next;
            }
            
            
        }
        return dummy.next;
    }
}