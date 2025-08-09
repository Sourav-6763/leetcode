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
        ListNode ptr=headA;
        int lengthA=0;
        while(ptr!=null){
            lengthA++;
            ptr=ptr.next;
        }
        ptr=headB;
        int lengthB=0;
        while(ptr!=null){
            lengthB++;
            ptr=ptr.next;
        }
        int Idx=Math.abs(lengthA-lengthB);
ListNode ptrb=headB;
ListNode ptra=headA;
        if(lengthA>lengthB){
for(int i=0;i<Idx;i++){
                ptra=ptra.next;
            }
        }
        else{
            for(int i=0;i<Idx;i++){
                ptrb=ptrb.next;
            }
        }
     
        while(ptrb!=ptra){
            ptra=ptra.next;
            ptrb=ptrb.next;
        }
        return ptra;

    }
}