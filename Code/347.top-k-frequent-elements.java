/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //  List<Integer> li = new ArrayList<>();
        int ans[] = new int[k];
        
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i : nums){
            mp.put(i, mp.getOrDefault(i,0)+1);
            // if(mp.get(i)==k) li.add(i);
        }

        List<Map.Entry<Integer,Integer>> li  =new ArrayList<>(mp.entrySet());

        Collections.sort(li, (a, b)-> b.getValue()-a.getValue());

        for(int i=0; i< k; ++i) ans[i] = li.get(i).getKey();
        return ans;
        
        // return li.stream().mapToInt(i->i).toArray();
    }
}
// @lc code=end

