/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
         Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                //Calculate the 3rd element:
                int third = -(arr[i] + arr[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
// @lc code=end

