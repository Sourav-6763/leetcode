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
        if(head==null) return null;
        ListNode ptr=head;
        ArrayList<Integer> ab=new ArrayList<>();
        while(ptr!=null){
            ab.add(ptr.val);
            ptr=ptr.next;
        }
        Collections.sort(ab);
        ListNode demo=new ListNode(-1);
        ptr=demo;
        for(int i=0;i<ab.size();i++){
            ListNode temp=new ListNode(ab.get(i));
            ptr.next=temp;
            ptr=ptr.next;
        }
        return demo.next;
    }
}