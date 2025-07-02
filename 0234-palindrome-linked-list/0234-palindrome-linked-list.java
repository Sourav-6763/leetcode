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
    public boolean isPalindrome(ListNode head) {
        StringBuilder ab = new StringBuilder();
        // StringBuilder ab2 = new StringBuilder();
        // Stack<Integer> stack = new Stack<>();
        ListNode ptr = head;
        while (ptr != null) {
            ab.append(ptr.val);
            // stack.add(ptr.val);
            ptr = ptr.next;

        }
        // while (!stack.isEmpty()) {
        //     ab2.append(stack.pop());
        // }
        String ab2 =new StringBuilder(ab).reverse().toString();
        if (ab.toString().equals(ab2)) {
            return true;
        }
        return false;
    }
}