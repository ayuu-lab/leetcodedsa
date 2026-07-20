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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp = head;
        ListNode cur =  head.next;
        while(cur!=null){
            if(temp.val==cur.val){
                if(cur.next==null){
                     cur=null;
                     temp.next = cur;
                }
                else cur = cur.next;
            }else{
                temp.next = cur;
                temp = cur;
                cur = temp.next;
            }
        }
        return head;
    }
}