// Last updated: 2/26/2026, 9:58:01 AM
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            ListNode ahead=cur.next;
            ListNode nextCur=cur.next.next;
            ahead.next=cur;
            cur.next=nextCur;
            prev.next=ahead;
            prev=cur;
            cur=nextCur;

        }
        return dummy.next;
    }
}