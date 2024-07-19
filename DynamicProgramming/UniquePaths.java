// Input: m = 3, n = 2
// Output: 3
// Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Down -> Down
// 2. Down -> Down -> Right
// 3. Down -> Right -> Down

class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        if(m==1 && n==1){
            return 1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        solve(0, 0, m, n, dp);
        return dp[0][0];
        
    }
    // Bottom up approach
    // Recursion
    public int solve(int i, int j, int m, int n, int[][]dp){
        if(i == m-1 && j == n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            return dp[i][j] = solve(i, j+1, m, n, dp) + solve(i+1, j, m, n, dp);
        }
    }
}
