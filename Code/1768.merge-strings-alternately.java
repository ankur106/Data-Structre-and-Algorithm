/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int w1=0, w2=0;
        boolean w1b = true;
        int w1l = word1.length(), w2l = word2.length();
        while(w1 < w1l || w2 < w2l){

            if(w1b) {
                sb.append(word1.charAt(w1));
                w1++;
                w1b = !w1b;
            }
            else{
                sb.append(word2.charAt(w2));
                w2++;
                w1b = !w1b;
            }

            if(w1 == w1l-1) w1b = false;
            else if(w2 == w2l-1) w1b = true; 

        }
        

        return sb.toString();
        
    }
}
// @lc code=end

