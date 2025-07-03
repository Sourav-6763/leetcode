/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr = headA;
        Set<ListNode> ab = new HashSet<ListNode>();
        while (ptr != null) {
            ab.add(ptr);
            ptr = ptr.next;
        }
        ListNode ptr2 = headB;
        while (ptr2 != null) {
            if (ab.contains(ptr2)){
                return ptr2;
            }
            ptr2 = ptr2.next;
        }
        return null;
    }
}