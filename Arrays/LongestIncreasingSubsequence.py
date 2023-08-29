# Recursion
# TC: O(2^n)

class Solution:
    def lis(self,ind,prev_ind, nums,n):
        if(ind == n):
            return 0
        # Not take case
        l = 0 + self.lis(ind+1, prev_ind, nums,n)
        if(prev_ind==-1 or nums[ind]>nums[prev_ind]):
            # Take the maximum of take and not take cases
            l = max(l, 1 + self.lis(ind+1, ind, nums, n))
        return l

    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        return self.lis(0, -1, nums, n)
        
