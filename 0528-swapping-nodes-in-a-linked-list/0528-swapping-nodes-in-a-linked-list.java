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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        ptr = head;
        ListNode ptr2 = head;
        int Backword = count - k;
        for (int i = 1; i <= count; i++) {
            while(Backword>0){
                ptr2=ptr2.next;
                Backword--;
            }
            if (i == k) {
                int temp=ptr.val;
                ptr.val=ptr2.val;
                ptr2.val=temp;
            }
            ptr = ptr.next;
            
        }
        return head;
    }
}