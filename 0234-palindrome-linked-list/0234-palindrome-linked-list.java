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
        ListNode ptr = head;
        StringBuilder ab = new StringBuilder();
        while (ptr != null) {
            ab.append(ptr.val);
            ptr = ptr.next;
        }
        int left = 0;
        int right = ab.length()-1;
        while (left < right) {
            if (ab.charAt(left) != ab.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}