/*
 * @lc app=leetcode id=99 lang=java
 *
 * [99] Recover Binary Search Tree
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
    public void recoverTree(TreeNode root) {

        traverse(root, null);
    }

    private void traverse (TreeNode node, TreeNode parent){
        if(node == null) return;
        if(node.left != null && node.left.val > node .val){
            swap(node, node.left, parent);
            return;
        }
        if(node.right != null && node.right.val < node .val){
            swap(node, node.right, parent);
            return;
        }
        traverse(node.left, node);
        traverse(node.right, node); 

    }

    private void swap(TreeNode curr, TreeNode child, TreeNode parent){
        // boolean left = parent.left == curr;
        int t;

        // if(left){
            t = child.val;
            child.val = curr.val;
            curr.val = t;

        // }
    }




}
// @lc code=end

