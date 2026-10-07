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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int sum = 0;
        String s = "";
        while(temp != null){
            s += temp.val;
            temp=temp.next;
        }
        System.out.println(s);
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1'){
                sum += (int)Math.pow(2,s.length()-j-1);
            }
        }
        return sum;
    }
}