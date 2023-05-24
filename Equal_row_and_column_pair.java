import java.util.*;
public class Equal_row_and_column_pair {
    public int equalPairs(int[][] grid) {

        int ans =0;
        int n = grid.length;
        Map<Integer,  ArrayList<Integer>> row = new HashMap<>();
        Map<Integer,  ArrayList<Integer>> col = new HashMap<>();

        for(int i = 0; i<n; i++){
            row.put(i, new ArrayList<>());
            col.put(i, new ArrayList<>());
        }
        for(int i =0; i<n; i++){
            for(int j =0; j< n; j++){
                row.get(i).add(grid[i][j]);
                col.get(j).add(grid[i][j]);
            }
        }
        for(int i =0; i<n; i++){
            for(int j =0; j< n; j++){
                if(row.get(i).equals(col.get(j))){
                    ans++;
                }
            }
        }
        return ans;
    }
}
