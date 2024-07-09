// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        ans.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] temp = new int[2];
            if(ans.get(ans.size()-1)[1]>=intervals[i][0]){
                temp[0] = Math.min(ans.get(ans.size()-1)[0], intervals[i][0]);
                temp[1] = Math.max(ans.get(ans.size()-1)[1], intervals[i][1]);
                ans.set(ans.size()-1, temp);
            }
            else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
