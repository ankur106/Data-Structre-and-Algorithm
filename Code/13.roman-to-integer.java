/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {

        int len = s.length();
        int val = 0;
        val += charvalue(s.substring(len-1,len ));
        for(int i = len-2 ; i>=0 ; --i ){

             System.out.println(val + " " + s.substring(i, i+1) + " "+ charvalue(s.substring(i, i+1)));
            if(higherOrder(s.substring(i, i+1), s.substring(i+1, i+2))){
                val += charvalue(s.substring(i, i+1));
            }else{
                val -= charvalue(s.substring(i, i+1));
            }
        }


        return val;
        
    }

    private int charvalue (String s){
        int value = 0;
       
        switch(s){
            case "I":
                value = 1;
                break;
            case "V":
                value = 5;
                break;
            case "X":
                value = 10;
                break;
            case "L":
                value = 50;
                break;
            case "C":
                value = 100;
                break;
            case "D":
                value = 500;
                break;
            case "M":
                value = 1000;
                break;  
        }
        return value;
    }

    private boolean higherOrder(String s1, String s2){
        return charvalue(s1) >= charvalue(s2);
    }
}
// @lc code=end

