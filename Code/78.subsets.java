/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =  new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        Arrays.fill(arr, 0, arr.length, false); 
        ans.add(new ArrayList<Integer>());
        for(int i=1; i<= nums.length;++i){
            generateSet(nums, ans, i, 0, arr, 0);
        }

        return ans;
        
    }


    public void generateSet(int[] nums, List<List<Integer>> ans, int length, int index, boolean[] arr, int currLen){
        
        if(index > nums.length) return;
        if(currLen == length){
            
            List<Integer> p = new ArrayList<>();
            for(int i=0; i< nums.length; ++i ){
                if(arr[i]==true) {
                    System.out.println(i);
                    p.add(nums[i]);
                }
            }
            ans.add(p);
            return;
        }


        for(int i = index; i< nums.length; ++i){
            arr[i] = true;
            ++currLen;
            if(i== nums.length -1 )System.out.println( "Ankur" );
            generateSet(nums, ans, length, i+1, arr, currLen);
            arr[i] = false;
            --currLen;
        }

    }
}
// @lc code=end

