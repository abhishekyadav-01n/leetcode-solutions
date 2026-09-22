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
    public ListNode mergeKLists(ListNode[] lists) { //Brute Force
        ArrayList<Integer> list = new ArrayList<>();

        for(ListNode head : lists){
            ListNode current = head;
            while(current != null){
                list.add(current.val);
                current = current.next;
            }
        }
        Collections.sort(list);


        ListNode dummy = new ListNode(0);
        ListNode current =  dummy;

        for(int num : list){
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;


    }
}