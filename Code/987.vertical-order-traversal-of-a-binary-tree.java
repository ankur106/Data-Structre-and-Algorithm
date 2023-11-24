/*
 * @lc app=leetcode id=987 lang=java
 *
 * [987] Vertical Order Traversal of a Binary Tree
 */

// @lc code=start

import java.util.*;
import java.util.stream.Collectors;

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
    public record row(int row, int val){}

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        Map<Integer, List<row>> mp  = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        putInMap(root, mp, 0, 0);

        Integer[] keys = mp.keySet().stream().toArray(Integer[]::new);
        Arrays.sort(keys);

        for(int i : keys){

            List<row> li = mp.get(i);
            li.sort((a,b)->{
                if(a.row==b.row){
                    return a.val - b.val;
                }else {
                    return a.row - b.row;
                }
            });
            List<Integer> ff = li.stream().map(a -> a.val).collect(Collectors.toList());
            ans.add(ff);
        }


        return ans;
        
    }

    private void putInMap(TreeNode root, Map<Integer, List<row>> mp , int column, int row){
        if(root == null) return;

        if(mp.containsKey(column)){
            mp.get(column).add(new row(row, root.val));
        }else{
            List<row> li = new ArrayList<>();
            li.add(new row(row, root.val));
            mp.put(column, li);
        }

        putInMap(root.left, mp, column-1, row +1 );
        putInMap(root.right, mp, column+1, row +1);

    }
}
// @lc code=end

