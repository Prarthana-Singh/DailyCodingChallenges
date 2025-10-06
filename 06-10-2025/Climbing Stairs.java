
// Recursion + Memoization (Top-Down DP)

class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {
        if (n <= 2) return n;
        if (memo[n] != 0) return memo[n];

        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}


// Bottom-Up DP (Tabulation)

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}


// Space Optimized DP (Most Efficient)

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}


