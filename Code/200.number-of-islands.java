/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start

import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int[][] track = new int[n][m];
        int ans = 0;

        for(int i =0; i < n; ++i){
            for(int j=0; j< m; ++j){
                if(track[n][m]==0 && grid[i][j]=='1'){
                    bfs(i,j,track, grid);
                    ans++;
                }
            }
        }
    }

    private void bfs(int p, int q, int[][] track, char[][] grid){

        Queue<Integer[]> que = new ArrayDeque<>();
        que.add(new Integer[]{p,q});
       
        int n = track.length, m = track[0].length;

        int[] x = new int[]{0,-1,0,1, -1, -1, 1, 1};
        int[] y = new int[]{-1,0,1,0 , -1, 1, 1, -1};

        while(que.size()>0){
            Integer[] coor = que.poll();
             track[coor[0]][coor[1]] = 1;
            for(int i =0; i < 6;++i){

                int x_coor = coor[0] + x[i];
                int y_coor = coor[1] + y[i];

                if(x_coor >=0 &&  y_coor >= 0 && x_coor < n && y_coor < m && grid[x_coor][y_coor]=='1'){
                    que.add(new Integer[]{x_coor,y_coor});
                }

            }
        }
    }
}
// @lc code=end

