/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start

import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int i=0, j=1, k= nums.length -1;

        int ii = -1, jj= -1, kk = -1;

        int diff = Integer.MAX_VALUE;
        while( i < j && j < k){

            int temp = Math.abs(target - (nums[i] + nums[j] + nums[k]));

            if(temp < diff){
                ii = i; 
                jj = j;
                kk = k;
                diff = temp;

                

            }else if(temp == 0){
                return nums[i] + nums[j] + nums[k];
            }else {

            }

        }

        return nums[i] + nums[j] + nums[k];
        
    }
}
// @lc code=end

