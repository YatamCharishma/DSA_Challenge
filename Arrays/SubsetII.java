// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

class Solution {
    public void solve(int[] nums, int index, List<Integer> ds, List<List<Integer>> res){
        res.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            solve(nums, i+1, ds, res);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), res);
        return res;
    }
}
