
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 =  headB;
        while(t1!=t2){
            t1 = (t1!=null)?t1.next:headB;
            t2 = (t2!=null)?t2.next:headA;
        }
        return t1;
        // brute force
        // ListNode temp1 = new ListNode();
        // HashSet <ListNode> sim = new HashSet <>();
        // ListNode temp = headA;
        // while(temp!=null){
        //     sim.add(temp);
        //     temp = temp.next;
        // }
        // temp = headB;
        // while(temp!=null){
        //     if(sim.contains(temp)){
        //         return temp;
        //     }
        //     temp = temp.next;
        // }
        // return null;
    }
}