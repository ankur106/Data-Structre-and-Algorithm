/*
 * @lc app=leetcode id=1630 lang=java
 *
 * [1630] Arithmetic Subarrays
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean>  ans  =new ArrayList<>();
        int n = nums.length;
        boolean[][] arr = new boolean[n][n];

        for(int i = 0; i < l.length; ++i){
            ans.add(checkSuqence(nums, l[i], r[i]));
        }

        return ans;
        
    }

    private boolean checkSuqence(int[] nums, int l, int r){

        int[] arr = new int[r-l+1];
        for(int i =l; i <=r; ++i ){
            arr[i-l] = nums[i];
        }

        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=1; i < arr.length; ++i){
            if(arr[i]-arr[i-1] != diff) return false;
        }
        return true;
    } 
}
// @lc code=end

