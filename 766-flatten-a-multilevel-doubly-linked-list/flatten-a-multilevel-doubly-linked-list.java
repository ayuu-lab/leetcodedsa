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
        Node cur = head;
        while(cur!=null){
            if(cur.child!=null){
                Node temp = cur.next;
                Node CT = cur.child;
                Node temp2 = cur.child;
                while(CT.next!=null){
                    CT=CT.next;
                }
                CT.next = temp;
                if(temp!=null) temp.prev = CT;
                cur.next = temp2;
                temp2.prev = cur;
                cur.child = null;
            }
            cur = cur.next;
        }
        return head;
    }
}