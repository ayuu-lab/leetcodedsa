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
 import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        // recursive approach
        if(head==null || head.next ==null) return head;
        ListNode ans = reverseList(head.next);
        ListNode prev = head.next;
        prev.next = head;
        head.next = null;
        return ans;
        // iterative approach
        // ListNode Ans = null;
        // ListNode prev = Ans ;

        // while(head!=null){
        //     prev = head;
        //     head = head.next;
        //     prev.next = Ans;
        //     Ans = prev ;
        // }
        // return Ans;

        // Brute force
        // ArrayList<ListNode> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     list.add(temp);
        //     temp = temp.next;
        // }
        // ListNode dum = new ListNode(-1);
        // ListNode temp1 = dum;
        // for(int i=list.size()-1;i>=0;i--){
        //     temp1.next = list.get(i);
        //     temp1 = temp1.next;
        //     temp1.next = null;
        // }
        // return dum.next;
    }
}