/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int len = s.length();

        HashMap<String,String> check = new HashMap<>();
        
        for (int i=0 ; i<len ; ++i){
            
            if(!check.containsKey(s.substring(i,i+1)) && !check.containsValue(t.substring(i,i+1)))
                check.put(s.substring(i,i+1),t.substring(i,i+1));
            else if (!check.getOrDefault(s.substring(i,i+1), "").equals(t.substring(i,i+1)))
                return false;
        }
        return true;
    }
}
// @lc code=end

