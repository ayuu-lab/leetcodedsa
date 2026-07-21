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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode start = head, end = head ;
        int i = 1;
        while(i<=k){
            if(end==null) return head;
            end = end.next;
            i++;
        }
        ListNode newhead = reverse(start,end);
        start.next = reverseKGroup(end,k);
        return newhead;
    }
    public ListNode reverse(ListNode st,ListNode en) {
        if(st.next==en){
            return st;
        }
        ListNode temp1 = reverse(st.next,en);
        st.next.next = st;
        st.next = null;
        return temp1;
    }
}