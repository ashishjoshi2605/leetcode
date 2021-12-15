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
    public ListNode reverseList(ListNode head) {
        ListNode current = head, previous = null;
        while(current!=null){
            ListNode holdNext = current.next;
            current.next = previous;
            previous = current;
            current = holdNext;
        }
        return previous;
    }
}