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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftNode = head;
        ListNode rightNode = head;
        ListNode prevLeftNode = dummy;
        for(int i = 1; i<left ; i++){
            leftNode = leftNode.next;
            prevLeftNode = prevLeftNode.next;
        }
        for(int i = 1; i<right ; i++){
            rightNode = rightNode.next;
        }

        ListNode stop = rightNode.next;
        ListNode next = stop;
        while(leftNode != stop){
            ListNode temp = leftNode.next;
            leftNode.next = next;
            next = leftNode;
            leftNode = temp;
        }

        prevLeftNode.next = rightNode;
        return dummy.next;
    }
}