/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        int counter = 1;
        List<List<Integer>> ans = new ArrayList<>();
        int level = 0;
        Deque<TreeNode> que = new ArrayDeque<>();

        if(root == null) return ans;
        que.add(root);
        while(que.size()>0){
            if(counter > 0){
                List<Integer> li = new ArrayList<>();
                Deque<TreeNode> quee = new ArrayDeque<>();
                while (counter > 0) {
                    if(level%2 ==0 ){
                        TreeNode tn= que.pollLast();
                        if(tn.left != null ) quee.offer(tn.left);
                        if(tn.right != null ) quee.offer(tn.right);
                        li.add(tn.val);
                    }else{
                        TreeNode tn = que.pollLast();
                        if(tn.right != null ) quee.offer(tn.right);
                        if(tn.left != null ) quee.offer(tn.left);

                        li.add(tn.val);
                    }
                    counter--;
                }
                ans.add(li);
                que = quee;
                level++;
            }else{
                counter = que.size();
            }


        }


        return ans;
    }
}
// @lc code=end

