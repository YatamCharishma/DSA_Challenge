// You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]).
// The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
// The robot can only move either down or right at any point in time.

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][] dp = new int[n][m];
        for(int[] i:dp) Arrays.fill(i, -1);
        return solve(0, 0, n, m, dp, obstacleGrid);
    }
    public int solve(int i, int j, int r, int c, 
    int[][] dp, int[][]grid){
        if(i==r || j==c){
            return 0;
        }
        else if(grid[i][j] == 1){
            return 0;
        }
        else if(i==r-1 && j==c-1){
            return 1;
        }
        else if(dp[i][j] != -1){
            return dp[i][j];
        }
        else{
            return dp[i][j] = solve(i+1, j, r, c, dp, grid) + solve(i, j+1, r, c, dp, grid);
        }
    }
}
