class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
        }
        if(total % 2 != 0){
            return false;
        }
        int sum = total/ 2;

        return subset_sum(nums , sum);
    }
    public boolean subset_sum(int arr[] , int s)
    {
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][s+1];
        for(int i=0 ; i<n+1; i++){
            dp[i][0] = true;
        }
        for(int i=1; i<n+1; i++){
            for(int j = 1; j<s+1; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = (dp[i-1][j-arr[i-1]] || dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][s];
    }
}
