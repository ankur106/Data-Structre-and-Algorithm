/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> li = new ArrayList<>();

        inOrderTraversal(root, li);

        return li.get(k-1);
    }

    private void inOrderTraversal(TreeNode node, List<Integer> li){
        if(node == null) return;

        inOrderTraversal(node.left, li);
        li.add(node.val);
        inOrderTraversal(node.right, li);

    }
}
// @lc code=end

