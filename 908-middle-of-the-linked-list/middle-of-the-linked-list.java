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
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int s = 0;
        // while(temp!=null){
        //     s++;
        //     temp = temp.next;
        // }
        // int i = 1;
        // ListNode temp1 = head;
        // while(i<=s/2){
        //     temp1 = temp1.next;
        //     i++;
        // }
        // return temp1;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null &&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}