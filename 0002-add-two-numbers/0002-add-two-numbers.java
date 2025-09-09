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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode one = l1;
        ListNode two = l2;
        ListNode head = new ListNode(-1);
        ListNode ptr = head;
        while (one != null || two != null || carry==1) {
            int sum = 0 + carry;
            if (one != null) {
                sum = sum + one.val;
                one = one.next;
            }
            if (two != null) {
                sum = sum + two.val;
                two = two.next;
            }
            carry = sum / 10;
            sum = sum % 10;

            ListNode demo = new ListNode(sum);
            ptr.next = demo;
            ptr = ptr.next;

        }
        return head.next;
    }
}