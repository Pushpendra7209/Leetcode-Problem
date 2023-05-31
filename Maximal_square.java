public class Maximal_square {
    public int maximalSquare(char[][] matrix) {
        int max = 0 , res = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j = 0; j< n; j++)
            {
                if(i == 0 || j == 0)
                {
                    dp[i][j] = matrix[i][j] - '0';
                }
                else if(matrix[i][j] == '1')
                {
                    if(dp[i-1][j-1] == dp[i-1][j] && dp[i-1][j] == dp[i][j-1] && dp[i-1][j-1] == dp[i][j-1]){
                        dp[i][j] = dp[i-1][j] + 1;
                    }
                    else{
                        dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    }
                }
                else{
                    dp[i][j] = matrix[i][j] - '0';
                }
                // System.out.println(dp[i][j]);
                if(dp[i][j] > max)
                    max = dp[i][j];
                res = (max ) * (max);
            }
        }
        return res;
    }
}
