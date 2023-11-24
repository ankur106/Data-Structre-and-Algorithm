/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gg= g.length;
        int ss = s.length;
        int gp=0 , sp=0;
        if(gg==0 || ss ==0) return 0;
        int counter =0;
        while(gp < gg && sp < ss){
            if(g[gp]<= s[sp]){
                counter ++;
                gp++;
                sp++;
            }else {
                sp++;
            }
        }

        return counter;
        
        


        
    }
}
// @lc code=end

