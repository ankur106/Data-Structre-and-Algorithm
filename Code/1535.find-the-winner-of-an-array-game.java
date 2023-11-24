/*
 * @lc app=leetcode id=1535 lang=java
 *
 * [1535] Find the Winner of an Array Game
 */

// @lc code=start

import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int getWinner(int[] arr, int k) {
        
        Map<Integer, Integer> mp = new HashMap<>();
        
        List<Integer> li = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        int count = 0;
        int ans = 0;

        int length = arr.length;

        if(k > length*2){
            k = length*2;
        }

        while(count < k){
            if(li.get(0)>li.get(1)){
                int ind_0 = li.get(0);

                mp.put(ind_0, mp.getOrDefault(ind_0, 0)+1);
                count = mp.get(ind_0);
                ans  = ind_0;
                int temp  =li.get(1);
                li.remove(1);
                li.add(temp);
                
            }else if(li.get(1) > li.get(0)){

                int ind_1 = li.get(1);
                mp.put(ind_1, mp.getOrDefault(ind_1, 0)+1);
                count = mp.get(ind_1);
                ans  = li.get(1);
                int temp  =li.get(0);
                li.remove(0);
                li.add(temp);
            }
            
        }

        
        // for(Map.Entry<Integer,Integer> ent : mp.entrySet()){
        //     if(ent.getValue() > count){
        //         ans = ent.getKey();
        //     }
        // }

        return ans;



        
    }
}
// @lc code=end

