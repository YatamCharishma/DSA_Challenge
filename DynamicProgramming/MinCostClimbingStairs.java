// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
// You can either start from the step with index 0, or the step with index 1.
// Return the minimum cost to reach the top of the floor.

//DP- Bottom up - Iteration
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        for(int i=0; i<n; i++){
            if(i<2){
                dp[i] = cost[i];
            }
            else{
                dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
            }
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}

//DP - Memoization
class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        return Math.min(mincost(cost, n-1), mincost(cost, n-2));
    }
    public int mincost(int[] cost, int n){
        if(n < 0){
            return 0;
        }
        if(n==0 || n==1){
            return cost[n];
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = cost[n]+Math.min(mincost(cost, n-1), mincost(cost, n-2));
        return dp[n];
    }
}

//Recursion
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(mincost(cost, n-1), mincost(cost, n-2));
    }
    public int mincost(int[] cost, int n){
        if(n < 0){
            return 0;
        }
        if(n==0 || n==1){
            return cost[n];
        }
        return cost[n]+Math.min(mincost(cost, n-1), mincost(cost, n-2));
    }
}
