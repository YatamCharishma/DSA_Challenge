#Input: nums = [2,3,-2,4]
#Output: 6
#Explanation: [2,3] has the largest product 6.

def maxProduct(self, nums: List[int]) -> int:
        prefix = 1
        suffix = 1
        maxx = float(-inf)
        for i in range(len(nums)):
            if(prefix == 0):
                prefix = 1
            if(suffix == 0):
                suffix = 1
            prefix = prefix * nums[i]
            suffix = suffix * nums[len(nums)-1-i]
            maxx = max(prefix, suffix, maxx)
        return maxx
