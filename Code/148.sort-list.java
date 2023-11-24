/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
 */

// @lc code=start
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
    public ListNode sortList(ListNode head) {

        ListNode start = head;

        while (start!= null){
            ListNode next = start.next;
            ListNode small = start;
            while(next != null){
                if(next.val < small.val ) small = next;
                next =  next.next;
            }
            int temp = start.val;
            start.val = small.val;
            small.val = temp;
            start = start.next;
        }
        // System.out.println()
        return head;
        
    }
}
// @lc code=end

