/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 */

// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) k++; //shifting k
            else break;
        }
        return k;
    }
}
// @lc code=end

