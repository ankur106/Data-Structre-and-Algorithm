/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {

        double ans = 1.0;
        long nn = n;
        if (nn < 0)
            nn = -1 * nn;
        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0)
            ans = (double) (1.0) / (double) (ans);
        return ans;
        // if(n==0) return (double)1;

        // else if(n>0)return (double) (x * myPow(x, n-1));
        // else return (double)(1/(myPow(x, -1* n)));
    }
}
// @lc code=end
