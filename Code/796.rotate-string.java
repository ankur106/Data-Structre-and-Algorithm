/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length())
            return false;

        String newS = s + s;
        if(newS.contains(goal))
            return true;
        else
            return false;
        
    }
}
// @lc code=end

