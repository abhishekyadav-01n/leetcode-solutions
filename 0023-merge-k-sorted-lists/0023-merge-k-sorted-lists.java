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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();

        for(ListNode node : lists){
            ListNode curr = node;
            while(curr != null){
                list.add(curr.val);
                curr = curr.next;
            }
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int node : list){
            curr.next = new ListNode(node);
            curr = curr.next;
        }

        return dummy.next;
    }
}