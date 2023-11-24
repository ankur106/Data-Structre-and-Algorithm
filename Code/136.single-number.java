/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            int value = map.getOrDefault(i, 0);
            map.put(i, value + 1);
        }


        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        return -1;
        
    }
}
// @lc code=end

