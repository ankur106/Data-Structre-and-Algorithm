/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }

    private void findCombinations(int ind, int[] arr, int remain, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length || remain < 0)
            return;
        if (remain == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if( ind + 1 < arr.length && arr[ind] == arr[ind+1]{})
        ds.add(arr[ind]);
        findCombinations(ind + 1, arr, remain - arr[ind], ans, ds);
        ds.remove(ds.size() - 1);

        findCombinations(ind + 1, arr, remain, ans, ds);
    }
}
// @lc code=end
