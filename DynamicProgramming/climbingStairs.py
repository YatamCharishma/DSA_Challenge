#DP
class Solution:
    def climbStairs(self, n: int) -> int:
        dp = [-1]*(n+2)
        def f(ind, dp):
            if ind == 0 or ind == 1:
                return 1
            if dp[ind] != -1:
                return dp[ind]
            l = f(ind - 1, dp)
            r = f(ind - 2, dp)
            dp[ind] = l + r
            return l+r
        return f(n, dp)
