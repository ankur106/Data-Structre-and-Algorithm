/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
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
    int counter;
    public boolean isBalanced(TreeNode node) {
        int lh; /* for height of left subtree */
 
        int rh; /* for height of right subtree */
 
        /* If tree is empty then return true */
        if (node == null)
            return true;
 
        /* Get the height of left and right sub trees */
        lh = height(node.left);
        rh = height(node.right);
 
        if (Math.abs(lh - rh) <= 1 && isBalanced(node.left)
            && isBalanced(node.right))
            return true;
 
        /* If we reach here then tree is not height-balanced
         */
        return false;
    }
    int height(TreeNode node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;
 
        /* If tree is not empty then height = 1 + max of
         left height and right heights */
        return 1
            + Math.max(height(node.left),
                       height(node.right));
    }
}
// @lc code=end

