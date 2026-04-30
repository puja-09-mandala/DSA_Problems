class Solution {
    // int minn=Integer.MAX_VALUE;
    public int find(int n,int dp[],int cost[])
    {
        if(n==0)
        {
            return cost[0];
        }
        if(n==1)
        {
            return cost[1];
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=cost[n]+Math.min(find(n-1, dp,cost),find(n-2, dp,cost));
        return  dp[n];
    }
        public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
    int ans = Math.min(
    find(cost.length - 1, dp, cost),
    find(cost.length - 2, dp, cost)
);
        return ans;
    }
}