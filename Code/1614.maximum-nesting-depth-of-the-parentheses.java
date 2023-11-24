/*
 * @lc app=leetcode id=1614 lang=java
 *
 * [1614] Maximum Nesting Depth of the Parentheses
 */

// @lc code=start
class Solution {
    public int maxDepth(String s) {

        int counter = 0;
        int max = 0;
        for(char c : s.toCharArray()){

            if(c == '(' ){
                ++counter;
                max = Integer.max(counter, max);
            }
    
            if(c == ')') counter--;


        
        }

        return max;
        
    }
}
// @lc code=end

