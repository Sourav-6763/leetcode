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
    public ListNode sortList(ListNode head) {
        ListNode ptr=head;
        ArrayList<Integer> ab=new ArrayList<>();
        while(ptr!=null){
                ab.add(ptr.val);
                ptr=ptr.next;
        }
        Collections.sort(ab);
        ListNode dummy=new ListNode(-1);
        ListNode ptr2=dummy;
        for(int i :ab){
            ptr2.next=new ListNode(i);
            ptr2=ptr2.next;
        }
        return dummy.next;
    }
}