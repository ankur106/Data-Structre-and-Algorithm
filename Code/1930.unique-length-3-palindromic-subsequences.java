/*
 * @lc app=leetcode id=1930 lang=java
 *
 * [1930] Unique Length-3 Palindromic Subsequences
 */

// @lc code=start

import java.util.*;

class Solution {
    public int countPalindromicSubsequence(String s) {

        Map<Character, Integer[]> mp = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {

            Character c = s.charAt(i);

            if(!mp.containsKey(c)){
                mp.put(c , new Integer[]{i,-1});
            }else {
                mp.get(c)[1] = i;
            }


        }

        Set<String> set = new HashSet<>();
        for(Map.Entry<Character,Integer[]> ent : mp.entrySet()){
            Character key = ent.getKey();
            String st = Character.toString(key);
            int l = ent.getValue()[0], r = ent.getValue()[1];
            
            for(int i = l+1; i < r; ++i){
               set.add( st + s.charAt(i) + st);     
            }

        }
        return set.size();
    }

}
// @lc code=end
