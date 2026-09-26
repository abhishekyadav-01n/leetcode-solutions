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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null ) return head;
        ListNode lessNode = new ListNode(0);
        ListNode higherNode = new ListNode(0);

        ListNode curr = head;

        ListNode less = lessNode;
        ListNode high = higherNode;

        while(curr != null){
            if(curr.val < x){
                less.next = curr;
                less = less.next;
            }
            else{
                high.next = curr;
                high = high.next;
            }
            curr = curr.next;
        }

        less.next = higherNode.next;
        high.next = null;

        return lessNode.next;
    }
}