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
        ListNode cur=list1;
        List<Integer> ab= new ArrayList<>();
        while(cur!=null){
            ab.add(cur.val);
            cur=cur.next;
            
        }
        cur=list2;
         while(cur!=null){
            ab.add(cur.val);
            cur=cur.next;
            
        }
        Collections.sort(ab);
        ListNode dummy=new ListNode(-1);
        cur=dummy;
        for(int i=0;i<ab.size();i++){
            cur.next=new ListNode(ab.get(i));
            cur=cur.next;
        }

        return  dummy.next;
    }
}