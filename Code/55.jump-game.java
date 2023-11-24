/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        int len = nums.length;
        int l = len-1;
        int pt = len -2;

        while(pt >=0){
            if(nums[pt] >= l-pt){
                l = pt;
            }
            pt--;
        }

        return l==0;
        
    }
}
// @lc code=end

