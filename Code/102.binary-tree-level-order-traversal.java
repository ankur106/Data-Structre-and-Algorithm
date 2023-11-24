/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> qt = new LinkedList<>();
        List<List<Integer>> li = new ArrayList<>();
        if(root == null) return li;
        qt.offer(root);

        while(qt.size() != 0){
            int size = qt.size();
            List<Integer> lii = new ArrayList<>();

            for(int i=0; i< size; ++i){
                TreeNode node = qt.poll();
                lii.add(node.val);
                if(node.left != null) qt.add(node.left);
                if(node.right != null) qt.add(node.right);
            }
            li.add(lii);

        }

        return li;
        
    }
}
// @lc code=end

