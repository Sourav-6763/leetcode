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
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }
        ListNode prev=null;
        ListNode current=head;
        int idx=count-n;
        if (idx == 0) {
            return head.next; // Skip the head
        }
        for(int i=0;i<count;i++){
            if(i==idx){
                prev.next=current.next;
                break;
            }
            prev=current;
            current=current.next;
        }


        return head;
    }
}