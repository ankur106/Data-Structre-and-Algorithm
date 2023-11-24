/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        int len = strs.length;

        if(len ==0) return "";
        else if (len ==1) return strs[0];

        Arrays.sort(strs);

        return longestCommonPrefixTwoWords(strs[0], strs[len-1]);
        
    }

    private String longestCommonPrefixTwoWords (String w1, String w2){
        int min = Math.min(w1.length(),w2.length());
        String res = "";


        for (int i = 0 ; i < min; ++i  ){
            if (w1.charAt(i)==w2.charAt(i))
                res += w1.charAt(i);
            else
                break;
        }

        return res;
    }
}
// @lc code=end

