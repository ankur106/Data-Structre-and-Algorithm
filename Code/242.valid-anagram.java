/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())return false;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i =0; i < s.length(); ++i){
            map.put(s.substring(i, i+1),map.getOrDefault(s.substring(i, i+1), 0)+1);
            

            map.put(t.substring(i, i+1),map.getOrDefault(t.substring(i, i+1), 0)-1);

    
        }

        Set<Integer> hash_set = new HashSet<>();
        hash_set.addAll(map.values()) ;
        

        if(hash_set.size()==1 && hash_set.contains(0))
            return true;
        else
            return false;




    }
}
// @lc code=end

