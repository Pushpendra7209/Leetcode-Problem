import java.util.ArrayList;
import java.util.List;
public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> ans = new ArrayList<>();
        int dp[][] = new int[n][n];
        for(int i =0; i<n; i++){
            List<Integer> list = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j == 0){
                    dp[i][j] = 1;
                    list.add(dp[i][j]);
                }
                else if(dp[i-1][j] == 0){
                    dp[i][j] = 1;
                    list.add(1);
                }
                else {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
                    list.add(dp[i][j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
