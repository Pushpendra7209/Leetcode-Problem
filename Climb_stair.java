public class Climb_stair {
    public int climbStairs(int n) {

        return memo(n, new int[n+1]);
    }
    public static int memo(int n, int dp[])
    {
        if(n == 0){
            return 1;
        }
        else if(n< 0){
            return 0;
        }
        if(dp [n] != 0){
            return dp[n];
        }
        int n1= memo(n-1, dp);
        int n2 = memo(n-2, dp);

        int nm = n1 + n2;

        dp[n] = nm;
        return nm;
    }
}
