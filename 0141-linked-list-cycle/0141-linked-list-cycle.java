/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode ptr=head;
        Set<ListNode> ab = new HashSet<>();
        while(ptr!=null){
            if(ab.contains(ptr)) return true;
            else{
                ab.add(ptr);
                ptr=ptr.next;
            }
            
        }
        return false;

        
    }
}