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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
          ptr=ptr.next;
          count++;
        }
    
        if(count==2){
            head.next=null;
            return head;
        }
       int idx=count/2;
       ListNode prev=null;
       ListNode current=head;
       for(int i=0;i<count;i++){
        ListNode next=current.next;
        if(i==idx){
            prev.next=next;
            break;
        }else{
            prev=current;
            current=next;
        }
        
       }
        return head;
    }
}