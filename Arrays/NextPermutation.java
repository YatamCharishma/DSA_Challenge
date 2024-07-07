// Input: nums = [1,2,3]
// Output: [1,3,2]

class Solution {
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i++, j--);
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(nums,0, n-1);
        }
        else{
            for(int i=n-1; i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums, i, ind);
                break;
            }
        }
        reverse(nums, ind+1, n-1);
        }
    }
}
