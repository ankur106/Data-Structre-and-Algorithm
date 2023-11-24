/*
 * @lc app=leetcode id=1441 lang=java
 *
 * [1441] Build an Array With Stack Operations
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li = new ArrayList<>();
        int size = target.length;
        int pointer = 0;

        for(int i =1 ; i <= n; ++i){
            if(pointer==size) break;

            if(i==target[pointer]){
                li.add("Push");
                pointer++;
            }else {
                li.add("Push");
                li.add("Pop");

            }

        }

        return li;
    }
}
// @lc code=end

