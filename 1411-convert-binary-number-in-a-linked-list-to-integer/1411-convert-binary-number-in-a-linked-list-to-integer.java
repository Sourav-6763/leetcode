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
    public int getDecimalValue(ListNode head) {
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        ptr=head;
        int sum=0;
        while(ptr!=null){
            sum=sum+ptr.val*(int)Math.pow(2,count-1);
            ptr=ptr.next;
            count--;
        }
        return sum;
    }
}