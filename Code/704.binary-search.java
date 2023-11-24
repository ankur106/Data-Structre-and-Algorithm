/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length -1, target);
    }

    private int binarySearch(int[] nums, int low, int high, int  target){
        
        int mid = nums[(low + high)/2];

        if(low <= high){
            if(mid>target) 
            return binarySearch(nums, low, ((high + low)/2)-1, target);
        else if (mid < target)
            return binarySearch(nums, ((high + low)/2)+1, high, target);
        else if (mid == target)
            return (low + high)/2;
        else 
            return -1;
        }

        return -1;
    }
}
// @lc code=end

