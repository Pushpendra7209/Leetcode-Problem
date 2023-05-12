public class Solving_question_with_brainpower {
    public long mostPoints(int[][] arr) {
        long dp[] = new long[arr.length+1];
        long ans =0;
        for(int i=arr.length-1; i>=0; i--)
        {
            int future = arr[i][1] + i +1;
            if(future >= arr.length)  dp[i] = arr[i][0];
            else
                dp[i] = dp[future] + arr[i][0];
            ans = Math.max(dp[i], ans);
            dp[i] = Math.max(dp[i], dp[i+1]);
        }
        return ans;
    }
}
