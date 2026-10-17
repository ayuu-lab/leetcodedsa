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
        Node cur1 = head;
        Node dum = new Node(-1);
        Node cur2 = dum;
        HashMap<Node , Node> map = new HashMap<>();
        while(cur1!=null){
            cur2.next = new Node(cur1.val);
            cur2 = cur2.next;
            map.put(cur1,cur2);
            cur1 = cur1.next;
        }
        cur1 = head;
        cur2 = dum.next;
        while(cur1!=null){
            if(map.get(cur1) != null) map.get(cur1).random = map.get(cur1.random);
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return dum.next;
    }
}