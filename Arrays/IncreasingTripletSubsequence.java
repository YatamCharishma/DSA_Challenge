//Input: nums = [1,2,3,4,5]
//Output: true
//Explanation: Any triplet where i < j < k is valid.

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int n: nums){
            if(n <= first){
                first = n;
            }
            else if(n <= second){
                second = n;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
