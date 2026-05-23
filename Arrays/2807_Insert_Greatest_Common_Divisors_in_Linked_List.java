class Solution {
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        
        while (curr != null && curr.next != null) {
            int g = gcd(curr.val, curr.next.val);
            
            // create new node
            ListNode newNode = new ListNode(g);
            
            // insert between curr and curr.next
            newNode.next = curr.next;
            curr.next = newNode;
            
            // move to next original node
            curr = newNode.next;
        }
        
        return head;
    }
}
