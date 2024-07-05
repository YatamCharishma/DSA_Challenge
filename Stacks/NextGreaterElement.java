class Solution {
    public static int[] nextGreater(int[] nums){
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            while(!st.empty() && nums[i] > nums[st.peek()]){
                res[st.peek()] = nums[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            res[st.peek()] = -1;
            st.pop();
        }
        return res;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nge[] = new int[nums2.length];
        nge = nextGreater(nums2);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            hm.put(nums2[i], nge[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i=0;i< nums1.length;i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;

    }
}
