import java.util.*;
public class Pascals_triangle_ll {
    public List<Integer> getRow(int n) {
        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<n+1; i++){
            for(int j = 0; j<=i; j++){
                if(j == 0 || i== j){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                }
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<n+1; i++){
            ans.add(dp[n][i]);
        }
        return ans;
    }
}
