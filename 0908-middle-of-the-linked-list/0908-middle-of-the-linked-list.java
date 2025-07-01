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
    public ListNode middleNode(ListNode head){
        ListNode ptr;
        ptr=head;
        int count=0;
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }
        int idx=count/2;
        ListNode ptr2=head;
        for(int i=0;i<count;i++){
            if(idx==i){
                head=ptr2;
                break;
            }
            ptr2=ptr2.next;
            
        }
        return head;

    }
}