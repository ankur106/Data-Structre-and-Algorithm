/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        Queue<Integer> q= new PriorityQueue<>((a,b)-> b-a);
        for(int i : nums) q.add(i);

        for (int i=1; i <=k-1; ++i) q.poll();
        
        return q.poll();
        
    }
}
// @lc code=end

