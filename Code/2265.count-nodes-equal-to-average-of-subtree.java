/*
 * @lc app=leetcode id=2265 lang=java
 *
 * [2265] Count Nodes Equal to Average of Subtree
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

    int ans;

    public record nodes(int sum, int n_nodes){}
    public int averageOfSubtree(TreeNode root) {

        findNodes(root);

        return ans;
    }


    public nodes findNodes(TreeNode root){
        if(root == null) return new nodes(0,0);
        if(root.left == null && root.right == null){return new nodes(root.val, 1);}
        nodes left = new nodes(0,0);
        nodes right = new nodes(0,0);
        if(root.left != null) left = findNodes(root.left);
        if(root.right != null) right = findNodes(root.right);
        nodes nd = new nodes(left.sum+right.sum + root.val , 1+ left.n_nodes + right.n_nodes);
        if(root.val == (nd.sum/nd.n_nodes)) ans = root.val;
        return nd; 
    }


}
// @lc code=end

