class Solution {
    public int f(int [] nums , int n , int [] dp){
        
        if (n == 0) return 0;

        if (n == 1) return nums[0];

        if(dp[n]!=-1) return dp[n];

        dp[n] = Math.max(f(nums,n-2,dp)+nums[n-1] , f(nums, n - 1, dp));

        return dp[n];

    }
    public int rob(int[] nums) {
        
        int n = nums.length;

        int [] dp = new int[n+1];

        Arrays.fill(dp,-1);

        return f(nums,n,dp);
    }
}