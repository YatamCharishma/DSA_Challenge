#Input: n = 00000000000000000000000000001011
#Output: 3
class Solution:
    def hammingWeight(self, n: int) -> int:
        cnt = 0
        for i in range(0,32):
            if((1<<i) & n):
                cnt += 1
        return cnt
