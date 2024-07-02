// Input: n = 1
// Output: true
// Explanation: 20 = 1

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return (n & n-1) == 0;
    }
}
