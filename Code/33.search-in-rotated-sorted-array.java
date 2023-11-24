/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ele = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                ele = mid;
            if (nums[low] <= nums[mid]) {
                // this means that left is sorted

                if (nums[low] <= target && nums[mid] >= target) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            }else if (nums[mid] <= nums[high] ){

                if(nums[mid]<= target && nums[high]>=target){
                    low  = mid +1;
                }else high = mid - 1;
            }

        }

        return ele;

    }
}
// @lc code=end
