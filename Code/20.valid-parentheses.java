/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.*;

class Solution {
    public boolean isValid(String s) {


        Stack<Character> st = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else {
                switch (c) {
                    case ')':
                        if(st.pop() != '(') return false;
                        break;
                    case ']':
                         if(st.pop() != '[') return false;
                        break;
                    case '}':
                         if(st.pop() != '{') return false;
                        break;
                
                
                }
            }
        }

        return st.size()==0? true: false;
        
    }
}
// @lc code=end

