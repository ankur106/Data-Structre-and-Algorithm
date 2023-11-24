/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public boolean hasCycle(ListNode head) {

        Listnode currNode = head;
        Listnode prevNode = null;

        while (currNode!= null){
            if(currNode = currNode.next) return true;
            prevNode = currNode;
            currNode = currNode.next;

        }

        return false;
        
    }
}
// @lc code=end

