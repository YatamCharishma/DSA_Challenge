// Input: sequence = "ababc", word = "ab"
// Output: 2
// Explanation: "abab" is a substring in "ababc".

class Solution {
    public int maxRepeating(String sequence, String word) {
        String tmp = word;
        int cnt = 0;
        while(sequence.contains(tmp)){
            tmp += word;
            cnt++;
        }
        return cnt;
    }
}
