/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
 */

// @lc code=start

import java.util.*;

import javax.swing.tree.TreeNode;

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
    public List<Integer> rightSideView(TreeNode root) {


        List<Integer> ans = new ArrayList<>();

        List<TreeNode> li  = new ArrayList<>();
        li.add(root);

        while(li.size()>0){
            List<TreeNode> lii = new ArrayList<>();

            for(TreeNode node : li){
                if(node.left != null) lii.add(node.left);
                if(node.right != null) lii.add(node.right);

            }

            ans.add(li.get(li.size()-1).val);
            li = lii;
        }
        
        return ans;
    }
}
// @lc code=end

