// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

//Sliding window
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxx = sum;
        for(int i=k; i<nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            maxx = Math.max(maxx, sum);
        }
        return (double)maxx/k;
    }
}
