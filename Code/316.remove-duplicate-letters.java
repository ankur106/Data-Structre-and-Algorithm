/*
 * @lc app=leetcode id=316 lang=java
 *
 * [316] Remove Duplicate Letters
 */

// @lc code=start

import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {

        // int counter = 0;
        // int[] arr = new int[26];
        // List<String> srr = new ArrayList<>();
        // for (char c : s.toCharArray()){
        //     if(arr[c-'a']==0)counter++;
        //     arr[c -'a'] = 1;
        // }

        // int l=0,r=0;

        // while(r< s.length()){
        //     char c = s.charAt(r);
        //     if(arr[c - 'a']> 0) counter --;

        // }

        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i; // track the lastIndex of character presence
        }
        
        boolean[] seen = new boolean[26]; // keep track seen
        Stack<Integer> st = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (seen[curr]) continue; // if seen continue as we need to pick one char only
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
                seen[st.pop()] = false; // pop out and mark unseen
            }
            st.push(curr); // add into stack
            seen[curr] = true; // mark seen
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append((char) (st.pop() + 'a'));
        return sb.reverse().toString();




        
    }
}
// @lc code=end

