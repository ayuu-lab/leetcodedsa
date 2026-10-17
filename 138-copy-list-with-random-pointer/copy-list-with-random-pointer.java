/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Node cur = head;
        while(cur!=null){
            Node temp = cur.next;
            cur.next = new Node(cur.val);
            cur.next.next = temp;
            cur = cur.next.next ;
        }
        cur = head ;
        while(cur!=null ){
            if(cur.random != null ) cur.next.random = cur.random.next;
            cur = cur.next.next ; 
        }
        cur = head.next ;
        Node original = head ;
        Node clone = head.next ;
        while(original != null && clone != null){
            original.next = clone.next;
            original = original.next ; 
            clone.next  = clone.next == null ? null : original.next ; 
            clone = clone.next ;
        }
        return cur;
    }
}