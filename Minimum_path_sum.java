public class Minimum_path_sum {
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        int i=0, j=0;
        for( i=0; i<grid.length; i++){
            for( j=0; j<grid[0].length; j++){
                if( i==0 && j==0){
                    dp[i][j] = grid[i][j];
                }
                else if(i == 0 && j>0){
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                }
                else if( j== 0 && i>0){
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                }
                else{
                    dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[i-1][j-1];
    }
}
