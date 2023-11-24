/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start

import java.util.*;

class Solution {

    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] ans = new int[n][m];

        for(int i=0 ; i< n ;++i) Arrays.fill(ans[i],-1);

        int[] dx = new int[]{0,-1,0,1};
        int[] dy = new int[]{-1,0,1,0};

        Queue<int[]> queue = new ArrayDeque<>();
        for(int i=0; i< n; ++i){
            for(int j=0; j < m; ++j){
                if(ans[i][j]!= -1 || mat[i][j]!=0) continue;
                queue.add(new int[]{i,j});
                ans[i][j] = 0;
                int size = queue.size();

                while(size>0){

                    for(int k=0; k< size; ++k){

                        int[] arr = queue.poll();

                        for(int l=0; l < 4; ++l){
                            int x = arr[0] + dx[l];
                            int y = arr[1] + dy[l];


                            if( x <0 || x >= n || y < 0 || y >=m) continue;

                            if(mat[x][y]==0 && ans[x][y] == -1){
                                ans[x][y] =0;
                                queue.add(new int[]{x,y});
                            } else if(ans[x][y] == -1 && mat[x][y]==1) {
                                ans[x][y] = ans[arr[0]][arr[1]] +1;
                                queue.add(new int[]{x,y});
                                
                            }else if(ans[x][y] > ans[arr[0]][arr[1]]+1){
                                ans[x][y] = ans[arr[0]][arr[1]] +1;
                                queue.add(new int[]{x,y});
                            }
                        }
                    }
                    size = queue.size();
                }

            }
        }

        return ans;
    }
}
// @lc code=end

