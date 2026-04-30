class Solution {
    public int climbStairs(int n) {
    //tabulation and small problem to larger part
        // 2 =1+1=2;
        // dp[1]=1
        // dp[0]=1'
        // dp[2]=dp[1]+dp[0];
        // dp[3]=dp[i-1]+dp[i-2]=2+1
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}