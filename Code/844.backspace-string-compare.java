/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start

import java.util.*;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        // modifiedString(s);

        return modifiedString(s).equals(modifiedString(t));
    }   

    private String modifiedString(String s){

        List<Character> clist = new ArrayList<>();
        
        char[] arr = s.toCharArray();
        for(int i=0; i< arr.length; ++i){
            int size = clist.size();
            if(arr[i]=='#' && size>0){
                clist.remove(size-1);
            }else if(arr[i] !='#'){
                clist.add(arr[i]);
            }
            
        }

        System.out.println(clist.toString());
        return clist.toString();
    }
}
// @lc code=end

