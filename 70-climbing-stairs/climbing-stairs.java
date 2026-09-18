class Solution {

    public int climbStairs(int n) {

        int prev = 1;  // if 1 stair, 1 way
        int prev2 = 2; // if 2 stairs, 2 ways

        if(n == 1) return prev;

        for(int i = 3; i <= n; i++) {

            int curr = prev + prev2; // current = previous + previous previous

            prev = prev2;            // move previous
            prev2 = curr;            // move current

        }

        return prev2; // answer for n stairs
    }
}