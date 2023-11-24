/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;




class Solution {
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> li1  =  new ArrayList<>();
        List<TreeNode> li2  =  new ArrayList<>();
        TreeNode t1;
        li1.add(root);
        li2.add(root);

        generateList(root, p, li1);
        generateList(root, q, li2);
        int li_size  = li1.size();
        for(int i = li_size-1 ;  i>=0; --i){
            t1 = li1.get(i);

            if(li2.contains(t1)) break;
        }

        return t1;

        // Collections.sort(li1, (a,b)-> a.val-b.val);
        // Collections.sort(li2, (a,b)-> a.val-b.val);

        // int index1=0, index2 = 0;
        // int len1 = li1.size(), len2 = li2.size();
          
        // System.out.println(li1.stream().map(a -> a.val).collect(Collectors.toList()).toString());
        // System.out.println(li2.stream().map(a -> a.val).collect(Collectors.toList()).toString());


        // while(index1 < len1 && index2 < len2){
        //     int li1_ele = li1.get(index1).val;
        //     int li2_ele = li1.get(index1).val;

        //     if(li1_ele == li2_ele){
        //         t1 = li1.get(index1);
        //         break;
        //     }else if(li1_ele < li2_ele){
        //         index1++;
        //     }else{
        //         index2++;
        //     }

        // }


    }

    private boolean generateList(TreeNode root, TreeNode p, List<TreeNode> li) {
        if (root == null)
            return false;

        if (root.val == p.val){
            // li.add(root);
            return true;
        }
            

        if (root.left != null) {
            li.add(root.left);
            if (generateList(root.left, p, li)) {
                return true;   
            }
            li.remove(li.size() - 1);
        }
        if (root.right != null) {
            li.add(root.right);
            if (generateList(root.right, p, li)) {
                return true;   
            }
            li.remove(li.size() - 1);
        }
        return false;
    }
}
// @lc code=end
