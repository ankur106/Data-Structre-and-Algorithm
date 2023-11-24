/*
 * @lc app=leetcode id=1004 lang=java
 *
 * [1004] Max Consecutive Ones III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {


        int kk =k;
        int max = Integer.MIN_VALUE;
        
        int count =0;
        for(int i : nums){


            if(i==1){
                count++;
            }else if(i==0 && kk>0){
                count++;
                kk--;
            }else {
                max = Math.max(max, count);
                kk=k;
                count=0;
            }
        }


        return max;
        
    }
}
// @lc code=end

