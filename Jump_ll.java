public class Jump_ll {
    public int uniquePathsWithObstacles(int[][] arr) {
        int a =0;
        int b = 0;
        int m = arr.length;
        int n = arr[0].length;
        int dp [][] = new int[m][n];
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++){
                if(i == 0 && j==0 && arr[i][j] == 1){
                    dp[i][j] = 0;
                    a = 1;
                    b = 1;
                }
                if(i == 0 && a == 1){
                    dp[i][j] =0;
                }
                else if( j== 0 && b == 1){
                    dp[i][j] =0;
                }
                else if(i == 0 && arr[i][j] == 1){
                    dp[i][j] = 0;
                    a = 1;
                }
                else if(j == 0 && arr[i][j] == 1){
                    dp[i][j]= 0;
                    b = 1;
                }
                else if(i == 0 || j==0){
                    dp[i][j] = 1;
                }
                else if(arr[i][j] == 1){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
