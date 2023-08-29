# memoization 
def lis(self,ind,prev_ind, dp, nums,n):
        if(ind == n):
            return 0
        # Not take case
        l = 0 + self.lis(ind+1, prev_ind, dp, nums,n)
        if(dp[ind][prev_ind+1] != -1):
            return dp[ind][prev_ind+1]
        if(prev_ind == -1 or nums[ind]>nums[prev_ind]):
            # Take the maximum of take and not take cases
            l = max(l, 1 + self.lis(ind+1, ind, dp, nums, n))
        dp[ind][prev_ind+1] = l
        return dp[ind][prev_ind+1]

    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [[-1 for i in range(n+1)]for j in range(n+1)]
        return self.lis(0, -1, dp, nums, n)
        
