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
        return helper(head,null);
    }
    public void helper(ListNode current,ListNode previous){
        if(current==null && previous!=null) return previous;
        if(current==null && previous==null) return null;
        ListNode holdNext = current.next;
        current.next = previous;
        previous = current;
        current = holdNext;
        return helper(current,previous);
    }
}