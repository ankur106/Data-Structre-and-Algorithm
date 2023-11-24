/*
 * @lc app=leetcode id=1846 lang=java
 *
 * [1846] Maximum Element After Decreasing and Rearranging
 */

// @lc code=start

import java.util.*;

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        Arrays.sort(arr);

        int curr = 1;
        if(arr[0]!= 1) arr[0]=1;
        for(int i = 1; i < arr.length; ++i){
            if(Math.abs(arr[0]-arr[i])==1) continue;

            arr[i] = curr + 1;
            curr =  arr[i];

        }

        return curr;
        
    }
}
// @lc code=end

