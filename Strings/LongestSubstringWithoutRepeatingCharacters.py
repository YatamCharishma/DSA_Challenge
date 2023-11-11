# Input: s = "abcabcbb"
# Output: 3
# Explanation: The answer is "abc", with the length of 3.

def lengthOfLongestSubstring(self, s: str) -> int:
        vis = {}
        l = 0
        ans = 0
        for r in range(len(s)):
            char = s[r]
            if char in vis and vis[char]>=l:
                l = vis[char] + 1
            else:
                ans = max(ans, r-l+1)
            vis[char] = r
        return ans
