/*
 * @lc app=leetcode id=1482 lang=java
 *
 * [1482] Minimum Number of Days to Make m Bouquets
 */

// @lc code=start
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if (bloomDay.length < k * m)
            return -1;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; ++i)
            max = Math.max(max, bloomDay[i]);

        int l = 1, r = max;
        int min = Integer.MAX_VALUE;

        while (l <= r) {
            int mid = (l + r) / 2;
            System.out.println(mid);
            if (bonqets(bloomDay, m, k, mid)) {
                min = Math.min(mid, min);
                r = mid-1;
            }else {
                l=mid+1;
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;

    }

    private boolean bonqets(int[] bloomDay, int m, int k, int days) {
        System.out.println(days + " "+ k + " " + m);
        int counter = 0;
        int in_counter = 0;
        for (int i = 0; i < bloomDay.length; ++i) {

            if (bloomDay[i] <= days) {
                in_counter++;
            } else {
                in_counter = 0;
            }

            if (in_counter == k) {
                counter++;
                in_counter = 0;
            }
        }

        System.out.println(counter);
        return counter >= m;
    }
}
// @lc code=end
