/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int n = image.length;
        int m = image[0].length;
        Queue<Integer[]> que= new ArrayDeque<>();

        que.offer(new Integer[]{sr,sc});

        int[] x = {0,-1,0,+1};
        int [] y = {-1, 0, +1, 0};
        while(que.size()>0){
            Integer[] temp = que.poll();
            image[temp[0]][temp[1]] = color;


            for(int i=0; i< 4; ++i){
                int xx  = temp[0] + x[i];
                int yy  = temp[1] + y[i];


                if(xx > 0 && yy > 0 && xx < n && yy < m){
                    que.offer(new Integer[]{xx,yy});
                }
            }

        }

        return image;
        
    }
}
// @lc code=end

