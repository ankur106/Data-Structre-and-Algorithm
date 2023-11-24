/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String frequencySort(String s) {

        HashMap<String,String> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(String.valueOf(c), map.getOrDefault(String.valueOf(c), "")+String.valueOf(c) );
        }

        List<String> arrList = new ArrayList<>(map.values());
        
        arrList.sort((a,b)-> b.length()-a.length());

        String ff = "";
        for (String ss : arrList){
            ff +=ss;
        }

        return ff;


        
    }
}
// @lc code=end

