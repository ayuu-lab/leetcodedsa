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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head ; 
        ListNode dum = new ListNode(-1);
        ListNode ans = dum ;
        while(temp !=null ){
            if(temp.val!=val){
                dum.next = new ListNode(temp.val);
                dum=dum.next;
            }
            temp = temp.next;
        }
        return ans.next;
    }
}