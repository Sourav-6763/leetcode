class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        ListNode next = head;
        ListNode prev = dummy;
        while (next!=null && next.next != null) {
            next = cur.next;
            if (next.val == cur.val) {
                while ( next!=null && next.val == cur.val) {
                    next = next.next;
                }
               prev.next=next;
               cur=next;
            } else {
                prev=cur;
               cur=next;
            }

        }

        return dummy.next;
    }
}
