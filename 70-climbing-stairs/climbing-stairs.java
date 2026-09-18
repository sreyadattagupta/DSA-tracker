class Solution {

    public int climbStairs(int n) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1); // fill dp with -1

        return f(n, dp);
    }

    public int f(int n, int[] dp) {

        if(n == 1) return 1; // if one stair is left, take 1 step

        if(n == 2) return 2; // if two stairs are left, take 1+1 or 2 steps

        if(dp[n] != -1) return dp[n]; // if dp[n] already has an answer, return it

        dp[n] = f(n - 1, dp) + f(n - 2, dp); // calculate answer and store it

        return dp[n]; // return the calculated answer
    }
}