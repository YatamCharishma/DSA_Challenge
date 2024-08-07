// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10

class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0; i<n+1; i++){
            ans[i] = ans[i>>1] + (i & 1);
        }
        return ans;
    }
}
