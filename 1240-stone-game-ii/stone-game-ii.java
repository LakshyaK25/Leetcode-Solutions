class Solution {
    private int f(int i, int M, int[] piles, int[] suffix, int[][] dp) {
        int n = piles.length;
        // Base case: If remaining piles <= 2 * M, take all remaining stones
        if (i + 2 * M >= n) {
            return suffix[i];
        }
        if (dp[i][M] != -1) {
            return dp[i][M];
        }
        int maxStones = 0;
        int currentTake = 0;
        for (int X = 1; X <= 2 * M; X++) {
            currentTake += piles[i + X - 1];
            int newM = Math.max(M, X);
            // Total stones from remaining piles minus what opponent gets
            int opponentStones = f(i + X, newM, piles, suffix, dp);
            int totalStones = currentTake + (suffix[i + X] - opponentStones);
            maxStones = Math.max(maxStones, totalStones);
        }
        return dp[i][M] = maxStones;
    }
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffix = new int[n + 1];
        // Compute suffix sums: suffix[i] is sum of piles from i to n-1
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = piles[i] + suffix[i + 1];
        }
        int[][] dp = new int[n][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(0, 1, piles, suffix, dp);
    }
}