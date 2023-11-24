/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        //to convert list into array 
        // List<Integer> li = null;
        // int[] piles = li.stream().mapToInt(i->i).toArray();
 
        // lets try implement binary search
        int low  =  1;
        int high = Collections.max(Arrays.asList(Arrays.stream(piles).boxed().toArray(Integer[]::new)));
        int k = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(findHoursBykoko(piles, mid) <= h){
                high  = mid -1;
                k = mid;

            }else low = mid + 1;
        }

        return k;
    }

    long findHoursBykoko (int[] piles, int rate){
        long hours = 0;
        for(int x: piles){
            hours += (long)Math.ceil((double)x/rate);
        }
        System.out.println(hours + " "+ rate);
        return hours;
    }
}
// @lc code=end

