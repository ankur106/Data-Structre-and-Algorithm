/*
 * @lc app=leetcode id=1793 lang=java
 *
 * [1793] Maximum Score of a Good Subarray
 */

// @lc code=start
class Solution {
    public int maximumScore(int[] nums, int k) {
        


        int length = nums.length;
        int l= k, r=k,lp=k, rp=k;
        int lmin = Integer.MAX_VALUE, rmin = Integer.MAX_VALUE;
        int lminans = Integer.MAX_VALUE, rminans = Integer.MAX_VALUE;
        int lans = Integer.MIN_VALUE,rans = Integer.MIN_VALUE;

        while(l>=0){
            lmin = Math.min(lmin, nums[l]);

            int temp = (k-l+1) * (lmin);
            System.out.println(temp +  " "+ lmin + ' '+ l );
            if(temp>lans) {lp=l; lans = temp;lminans = lmin;}

            l--;
        }

        while(r<=length-1){
            rmin = Math.min(rmin, nums[r]);

            int temp = (r-k+1) * (rmin);
            if(temp>rans) {rp=r; rans = temp;rminans = rmin;}

            r++;
        }

        if(lminans  < rminans){
            while(nums[rp] >lminans  && rp < length-1){
                rp++;
            }
            rp--;
        }else {
            while(nums[lp] >rminans && lp >=0){
                lp--;
            }
            lp++;
        }
        

        System.out.println(rp+" "+ lp);
        return (rp-lp+1)*Math.min(lminans, rminans);

    }
}
// @lc code=end

