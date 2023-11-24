/*
 * @lc app=leetcode id=1781 lang=java
 *
 * [1781] Sum of Beauty of All Substrings
 */

// @lc code=start

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int beautySum(String s) {

        int sum = 0;

        for(int i = 0 ; i<= s.length()-3; ++i){

            for (int j = i + 3; j<= s.length(); ++j){
                // System.out.println(i + " "+ j);
                sum += findBeauty(s.substring(i, j));
            }
        }
        return sum;
        
    }

    private int findBeauty (String s){

        // HashMap<String,Integer> map = new HashMap<>();

        // for(char a : s.toCharArray()){
        //     map.put(Character.toString(a), map.getOrDefault(Character.toString(a), 0)+1);
        // }

        // Set<Integer> ss = new HashSet<>(map.values());

        // System.out.println(Collections.max(ss) -  Collections.min(ss) + " "+ s);
        int freq[] =  new int[26];
        int min=1, max=1;

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;

        for(int i : freq){
            if(i !=0)min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return max - min;
    }
}
// @lc code=end

