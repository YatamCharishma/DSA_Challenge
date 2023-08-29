#Input: nums = [1,3,2,2,5,2,3,7]
#Output: 5
#Explanation: The longest harmonious subsequence is [3,2,2,2,3].

def findLHS(self, nums: List[int]) -> int:
        d,ans = {},0
        for i in nums:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        for i in d:
            if i+1 in d.keys():
                ans = max(ans, d[i] + d[i+1])
        return ans
