/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {


        boolean hasZero = false;
        int product =1;

        for(int i : nums){
            if(i==0) {hasZero = true;continue;}

            product *= i;

        }
        

        int ans[] = new int[nums.length];
        
        for(int i = 0 ; i< nums.length ; ++i){
            if(hasZero){
                if(nums[i] != 0){
                    ans[i] = 0;
                }else{
                    ans[i] = product / nums[i];
                }
                continue;
            }
             ans[i] = product / nums[i];
        }

        return ans;
}
    }


// @lc code=end

