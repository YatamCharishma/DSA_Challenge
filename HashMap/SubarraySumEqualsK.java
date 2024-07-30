//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//Prefix sum approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int cnt = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(hm.containsKey(sum-k)){
                cnt += hm.get(sum-k);
            }
        hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}
