/*
https://leetcode.com/problems/reverse-linked-list/
*/

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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode prev = null;
        ListNode cur = head;
        // ListNode next = head.next;

        while(cur != null){
            ListNode next = cur.next;
             cur.next = prev;
             prev = cur;
             cur = next;
            // next = (next.next != null) ? next.next : null;
        }
         
        return prev;
    }
}
