// Extended Moore's Algorithm
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ time
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(cnt1 == 0 && nums[i] != ele2){
                cnt1 += 1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != ele1){
                cnt2 += 1;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List <Integer> lst = new ArrayList<Integer>();
        cnt1 = 0;
        cnt2 = 0;
        int minn = (int)(nums.length/3) + 1;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == ele1) cnt1++;
            if(nums[i] == ele2) cnt2++;
        }
        if(cnt1 >= minn) lst.add(ele1);
        if(cnt2 >= minn) lst.add(ele2);
        return lst;
    }
}
