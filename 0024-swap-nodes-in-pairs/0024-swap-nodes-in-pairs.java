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
    public ListNode swapPairs(ListNode head) {
        if(head ==null  ) return null ;
        if(head.next ==null) return head; 
        ListNode current=head;
        ListNode prev=null;
        while(current!=null && current.next!= null){ 
            prev=current;
            current=current.next;
            int temp;
            temp=current.val;
            current.val=prev.val;
            prev.val=temp;
              prev=current;
            current=current.next;
        }
        return head;
    }
}