/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        int n = matrix.length;

        int m  = matrix[0].length;



        int l = 0, r = n*m -1;


        while (l<=r){
            int mid = (l+r)/2;
            int ans = ele(matrix, mid,n,m);
            if(ans == target){
                return true;
            }
            else if(ans> target){
                r = mid -1;
            }else{
                l = mid +1;
            }
        }
        return false;

    }

    private int ele (int [][] martix, int onedseq ,int n, int m){
        return martix[onedseq/m][onedseq%m];
    }
}
// @lc code=end

