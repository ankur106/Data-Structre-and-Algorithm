/*
 * @lc app=leetcode id=1143 lang=java
 *
 * [1143] Longest Common Subsequence
 */

// @lc code=start

import java.util.*;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int len1 = text1.length(), len2  = text2.length();

        int[][] dp = new int[len1][len2];

        for(int i =0; i < len1 ; ++i) Arrays.fill(dp[i], -1); 

        return dp(text1, text2, len1-1, len2-1, dp);
        
    }

    private int dp( String text1, String text2, int s1, int s2, int[][] dp) {

        

        if(s1 <0 || s2 < 0) return 0;
        if(dp[s1][s2] != -1) return dp[s1][s2];

        if(text1.charAt(s1) == text2.charAt(s2)){
            dp[s1][s2] =  dp(text1, text2, s1-1, s2-1, dp) + 1;
            return dp[s1][s2];
        }

        dp[s1][s2] = Math.max(dp(text1, text2, s1-1, s2, dp) , dp(text1, text2, s1, s2-1, dp));
        return dp[s1][s2];
    }
}
// @lc code=end

