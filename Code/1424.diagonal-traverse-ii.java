/*
 * @lc app=leetcode id=1424 lang=java
 *
 * [1424] Diagonal Traverse II
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int n, m=0;
        n = nums.size();
        List<Integer> ans = new ArrayList<>();
        for(List<Integer> li : nums){
            m = Math.max(m, li.size());

        }


        for(int i = 0; i < n; ++i){
            int p=i, q=0;

            while(p >=0 && q < m){

                try{
                    int num = nums.get(p).get(q);
                    ans.add(num);
                }catch(Exception e){

                }
                
                p--;q++;

            }
        }

        for(int j = 1; j < m ; ++j ){
            int p = n-1, q = j;
            while(p >=0 && q < m){

                try{
                    int num = nums.get(p).get(q);
                    ans.add(num);
                }catch(Exception e){

                }
                
                p--;q++;

            }
            
        }


        return ans.stream().mapToInt(i->i).toArray();
    }
}
// @lc code=end

