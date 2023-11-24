/*
 * @lc app=leetcode id=785 lang=java
 *
 * [785] Is Graph Bipartite?
 */

// @lc code=start

import java.util.*;

class Solution {
    public boolean isBipartite(int[][] graph) {
 
        

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int n_edges = 0;
        int n = graph.length;

        for(int i=0; i < n; ++i){
            Set<Integer> ref;
            if(s1.contains(i) && s2.contains(i)) return false;
            else if(s1.contains(i)) ref = s2;
            else if (s2.contains(i))ref = s1;
            else {
                s1.add(i)
            }


            int len = graph[i].length;
            if(len==0) return false;

            for(int j=0; j< len; ++j){
                ref.add(graph[i][j]);
                n_edges ++;
            }
        }
        int s1_size = s1.size();
        int s2_size = s2.size();
        
        System.out.println(s1_size+ " " + s2_size + " "+ n_edges);
        return n_edges == s1_size*s2_size*2;
        
        
    }
}
// @lc code=end

