class Solution {

    public int climbStairs(int n) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1); // fill dp with -1

        dp[1] = 1; // if 1 stair, 1 way

        if(n == 1) return dp[1];

        dp[2] = 2; // if 2 stairs, 2 ways

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2]; // current = previous + previous previous
        }

        return dp[n]; // return answer for n stairs
    }
}