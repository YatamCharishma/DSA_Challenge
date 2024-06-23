//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        for(int p2=0; p2<nums.length; p2++){
            if(nums[p2] != 0 && nums[p1] == 0){
                int tmp = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = tmp;
            }
            if(nums[p1] != 0){
                p1 += 1;
            }
        }
    }
}
