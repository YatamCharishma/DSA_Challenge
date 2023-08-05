#Fixed one element + Two Pointer Approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []
        for i in range(len(nums)):
            p1 = i+1
            p2 = len(nums)-1
            while(p1<p2):
                res = nums[i]+nums[p1]+nums[p2]
                if(res == 0):
                    val = [nums[i], nums[p1], nums[p2]]
                    if val not in ans:
                        ans.append(val)
                    p1 += 1
                    p2 -= 1
                elif(res<0):
                    p1 += 1
                else:
                    p2 -= 1
        return ans
