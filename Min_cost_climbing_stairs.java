public class Min_cost_climbing_stairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        dp[n-1] = cost[n-1];
        dp[n-2] = cost[n-2];
        if(n == 3){
            return Math.min(cost[1],(cost[0]+cost[2]));
        }
        int i = n-3;
        while(i>=0){
            if(cost[i] + dp[i+1] >= cost[i]+dp[i+2]){
                dp[i] = cost[i]+dp[i+2];
            }
            else{
                dp[i] = cost[i]+dp[i+1];
            }
            i--;
        }
        return Math.min(dp[0],dp[1]);
    }
}
