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
        if(head==null) return null;
        // early return 
        int value = head.val; // val:1
        if(head.next != null && value == head.next.val) {
            while(head.next != null && value == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next); // 1 next 
        }

        head.next = deleteDuplicates(head.next);
        return head;
    }
}