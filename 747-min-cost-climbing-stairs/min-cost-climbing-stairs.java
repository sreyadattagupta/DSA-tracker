class Solution {

    public int function( int [] cost, int n, int [] dp ){

        if(n==0) return 0;

        if(n==1) return 0;

        if(dp[n]!=-1) return dp[n];

        dp[n]=Math.min(function(cost,n-1,dp)+cost[n-1],function(cost,n-2,dp)+cost[n-2]);

        return dp[n];



    }
    public int minCostClimbingStairs( int[] cost ) {

        int n=cost.length;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1); // fill dp with -1

        return function(cost, n, dp);
    }
}