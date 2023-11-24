/*
 * @lc app=leetcode id=547 lang=java
 *
 * [547] Number of Provinces
 */

// @lc code=start
class Solution {
    public int findCircleNum(int[][] isConnected) {

        int len = isConnected.length;
        int[] arr = new int[len];
        int circ = 0;
        for (int i=0; i<len; ++i){
            if(arr[i]==1) continue;
            System.out.println(i + "Ankur");
            ff(isConnected, i, arr);
            circ++;
        }


        return circ;

        
    }

    private void ff(int[][] isConnected, int row, int arr[]){

        if(arr[row]==1) return;
        System.out.println(row);

        arr[row] =1;
        for(int i=0; i < isConnected[row].length; ++i){
            if (isConnected[row][i] ==1) ff(isConnected, i, arr);
        }
    }
}
// @lc code=end

