/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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
    public boolean isValidBST(TreeNode root) {

        List<Integer> li = new ArrayList<>();

        inOrderTraversal(root, li);

        boolean b = true;

        for(int i = 0; i < li.size()-1; ++i){
            if(li.get(i+1)< li.get(i)) b = false;
        }
        return b;
    }

    private void inOrderTraversal(TreeNode node, List<Integer> li){
        if(node == null) return;

        inOrderTraversal(node.left, li);
        li.add(node.val);
        inOrderTraversal(node.right, li);

    }
}
// @lc code=end

