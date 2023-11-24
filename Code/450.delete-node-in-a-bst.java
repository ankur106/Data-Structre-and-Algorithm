/*
 * @lc app=leetcode id=450 lang=java
 *
 * [450] Delete Node in a BST
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

    TreeNode curr;
    TreeNode prev;
    char cc;
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) return root;
        boolean b = findNode(root, null, key, 'R');

        if(this.prev == null && this.curr == root){

            if(this.curr.left == null){
                root = this.curr.right;

            }else if(this.curr.right== null){
                root = this.curr.left;
            }else {
                TreeNode leftest = giveLeftest(this.curr.right);
                leftest.left = this.curr.left;
                root = this.curr.right;
            }

        }else if (this.curr.left == null){
            if(this.cc == "L") this.prev.left = this.curr.right;
            if(this.cc == "R") this.prev.right = this.curr.right;


        }else if(this.curr.right== null){
            if(this.cc == "L") this.prev.left = this.curr.left;
            if(this.cc == "R") this.prev.right = this.curr.left;


        }else {
            TreeNode leftest = giveLeftest(this.curr.right);
            leftest.left = this.curr.left;
            if(this.cc == "L") this.prev.left = this.curr.right;
            if(this.cc == "R") this.prev.right = this.curr.right;
        }

        
        return root;
    }

    private TreeNode giveLeftest(TreeNode node){
        if(node.left != null) return giveLeftest(node.left);
        return node;
    }

    private boolean findNode(TreeNode curr, TreeNode prev, int key, char C){
        if(curr == null) return false;
        if(curr.val == key) {
            this.curr = curr;
            this.prev = prev;
            this.cc = C;
            return true;
        }

        if(curr.val > key && findNode(curr.left, curr, key, 'L')) return true;
        if(curr.val < key && findNode(curr.right, curr, key, 'R'))  return true;

        return false;

    }
}
// @lc code=end

