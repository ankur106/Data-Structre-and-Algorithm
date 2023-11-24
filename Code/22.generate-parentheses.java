/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
   List<String> s = new ArrayList();
    public List<String> generateParenthesis(int n) {
        
        gp("",0,n);
        List<String> w =  s.stream().map((s)->{
            String q = "";
            for (char c : s.toCharArray()){
                if(c == '1') q += "(";
                if(c == '0') q += ")";
            }
            return q;
        }).toList();

        return w;
    }

    private void gp(String s, int sum, int n) {
        
        if(s.length() > n*2 || sum > n ) return;
        System.out.println(s + " " + sum);
        if(s.length() == n*2 && sum ==0){
            System.out.println(s + " " + sum + "ADDED");
            this.s.add(s);
            return;
        }

        if(sum + 1 >=0 ){
            gp(s + "1",sum +1,n);
        }
        if(sum -1 >=0){
            gp(s + "0",sum -1,n);
        }


    }
}
// @lc code=end

