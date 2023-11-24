/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ele = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target){
                ele = mid;
                break;
            }
            if(nums[low] == nums[mid] && nums[mid]== nums[high]){
                low++;
                high--;
                continue;
            }
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

        return ele ==-1 ? false : true;
    }
}
// @lc code=end

