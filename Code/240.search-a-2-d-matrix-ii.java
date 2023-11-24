/*
 * @lc app=leetcode id=240 lang=java
 *
 * [240] Search a 2D Matrix II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        int p = 0, q = matrix[0].length-1;
        
        while( p < matrix.length && q >=0){
            if(matrix[p][q]==target) return true;

            if(matrix[p][q] > target){
                --q;
            }else {
                ++p;
            }
        }



        return false;
    }
}
// @lc code=end

