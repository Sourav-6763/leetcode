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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1=list1;
        ListNode ptr2=list2;
        ArrayList<Integer> ab=new ArrayList<>();
        while(ptr1!=null){
            ab.add(ptr1.val);
            ptr1=ptr1.next;
            
        }
        while(ptr2!=null){
            ab.add(ptr2.val);
            ptr2=ptr2.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        Collections.sort(ab);
    
        for(int i=0;i<ab.size();i++){
            current.next=new ListNode(ab.get(i));
            current=current.next;
        }
        return dummy.next;

    }
}