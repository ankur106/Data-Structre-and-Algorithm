/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
   public int rob(int[] nums) {
    
    int len = nums.length;

    if (len==0) return 0;
    if(len==1) return nums[0];
    if(len==2) return Math.max(nums[0], nums[1]);
    int[] n = new int[len];
    n[0] = nums[0];
    n[1] = nums[1];
    n[2] = nums[2] + nums[0];

    for(int i=3 ; i< len; ++i){
        n[i] = nums[i]+Math.max(n[i-2], n[i-3]);
    }

    return Math.max(n[len-1], n[len-2]);
        
    }


}
// @lc code=end

