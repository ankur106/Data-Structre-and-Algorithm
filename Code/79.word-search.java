/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length, m  = board[0].length;
        // boolean found = false;

        boolean[][] visited = new boolean[n][m];
       String s = word.substring(0, 1);
        for(int i  = 0 ; i < n; ++i ){
            // if(found) break;
            for(int j = 0; j < m; ++j){
                // if(found) break;
                if(Character.toString(board[i][j]).equals( s)){
                    visited[i][j] = true;
                    if(traverse(board, word, i, j-1,  new String(s), 1,visited)
                      || traverse(board, word, i, j+1,  new String(s), 1,visited)
                      || traverse(board, word, i+1, j,  new String(s), 1,visited)
                      || traverse(board, word, i-1, j,  new String(s), 1,visited)
                      ) return true;
                    visited[i][j] = false;
                }
            }
        }

        return false;
        
    }

    private boolean traverse (char[][] board, String word, int p, int q, String s, int index, boolean[][] visited){
        // System.out.println(s);
        if(s.equals(word)) return true;
        if(s.length() > word.length() || p < 0 || q < 0 || p>= board.length || q >= board[0].length || index  == word.length()) return false;
        if(visited[p][q]) return false;
        // System.out.println(board[p][q] + " "+ word.substring(index, index+1)+ " " + p + " " + q  + " "+ index);
        if(!Character.toString(board[p][q]).equals(word.substring(index, index+1)))return false;
        if(s.length() == word.length()) System.out.println(s);
        

        boolean left = false, right = false, down = false, up = false;

        s += board[p][q];
        visited[p][q] = true;
        left = traverse(board, word, p, q-1, s, index + 1, visited);
        right = traverse(board, word, p, q+1, s, index + 1, visited);
        down = traverse(board, word, p+1, q, s, index + 1, visited);
        up = traverse(board, word, p-1, q, s, index + 1, visited);
        s = s.substring(0, s.length()-1);
        visited[p][q] = false;
        System.out.println(right + " "+ left + " "+ down);
        return right || left || down || up;
        

    }
}
// @lc code=end

