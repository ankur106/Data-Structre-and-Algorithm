/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start

import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> mp = new HashMap<>();
        int counter  = 0;
        int sum = 0;
        for(int i=0; i < nums.length; ++i){
            sum += nums[i];
            if(sum==k || mp.containsValue(sum-k))counter++;
            mp.put(i, sum);

        }

        return counter;
        
    }
}
// @lc code=end

