/*
 * @lc app=leetcode id=343 lang=java
 *
 * [343] Integer Break
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {


        int sqrt = (int)Math.floor(Math.sqrt(n));

        int nums = n/sqrt;

        int remaining = n - nums*sqrt;

        if(remaining > 0){
            return (int)Math.pow(sqrt, nums)* remaining;
        }
        return (int)Math.pow(sqrt, nums);
        
    }
}
// @lc code=end

