/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;

        flattenDFS(head);
        return head;
    }
    public Node flattenDFS(Node curr){
        Node last = curr;

        while(curr != null){
            Node next = curr.next;

            if(curr.child != null){
                Node child = curr.child;
                Node childTail = flattenDFS(child);

                curr.next = child;
                child.prev = curr;

                childTail.next = next;
                if(next != null){
                    next.prev = childTail;
                }

                curr.child = null;

                last = childTail;
            }
            else{
                last = curr;
            }
            curr = next;
        }
        return last;
    }
}