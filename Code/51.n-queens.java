import java.util.*;
class Solution {
   public List<List<String>> solveNQueens(int n) {

        List<List<Integer>> ans = new ArrayList<>();
        solve(0,n,new ArrayList<Integer>(), ans);


        List<List<String>> st = new ArrayList<>();

        for(int i=0 ; i < ans.size(); ++i){
            List<String> clone=   new ArrayList<>();
            List<Integer> arrIntegers = ans.get(i);
            for(int j=0; j< n; ++j){
                int num = arrIntegers.get(j);
                num--;
                char[] charArray1 = new char[n];
                Arrays.fill(charArray1, '.');
                charArray1[num] = 'Q';
                String newString1 = new String(charArray1);
                clone.add(newString1);
                
            }

            st.add(clone);
        }

        return st;
        
    }


    private void solve(int index, int size, List<Integer> arr , List<List<Integer>> li){
        if(index == size){
            li.add(new ArrayList<>(arr));
            return;
        }

        List<Integer> forbidden = new ArrayList<>();

        for(int i=0; i< index; ++i ){
            int num = arr.get(i);
            forbidden.add(num - (index-i) );
            forbidden.add(num + (index-i) );
            forbidden.add(num);
            

        }

        for(int i = 1; i<= size; ++i ){
            if(!forbidden.contains(i)){
                arr.add(i);
                solve(index+1, size, arr, li);
                arr.remove(arr.size()-1);
            }
        }
        
    }
}