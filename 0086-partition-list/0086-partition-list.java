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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode fast = new ListNode(-1);
        ListNode sptr = small;
        ListNode fptr = fast;
        ListNode ptr = head;
        while (ptr != null) {
            if (ptr.val < x) {
                sptr.next = new ListNode(ptr.val);
                sptr = sptr.next;
            }
            ptr = ptr.next;
        }
        ptr = head;
        while (ptr != null) {
            if (ptr.val >= x) {
                fptr.next = new ListNode(ptr.val);
                fptr = fptr.next;
            }
            ptr = ptr.next;
        }
        sptr = small;
        fptr = fast;
        while(sptr!=null){
            if(sptr.next==null){
                sptr.next=fptr.next;
                break;
            }
            sptr=sptr.next;
        }   
        return small.next;

    }
}