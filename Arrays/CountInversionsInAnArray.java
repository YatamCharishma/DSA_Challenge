// Input Format
// : N = 5, array[] = {1,2,3,4,5}
// Result
// : 0
// Explanation
// : we have a sorted array and the sorted array has 0 inversions as for i < j you will never find a pair such that A[j] < A[i]. More clear example: 2 has index 1 and 5 has index 4 now 1 < 5 but 2 < 5 so this is not an inversion.

import java.util.* ;
import java.io.*; 
public class Solution {

    public static int merge(long[] arr, int low, int mid, int high){
        ArrayList<Long> tmp = new ArrayList<>();
        int cnt = 0;
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                tmp.add(arr[left]);
                left++;
            }
            else{
                tmp.add(arr[right]);
                cnt += (mid-left+1);
                right++;
            }
        }
        while(left <= mid){
            tmp.add(arr[left]);
            left++;
        }
        while(right <= high){
            tmp.add(arr[right]);
            right++;
        }
        for(int i = low;i<=high;i++){
            arr[i] = tmp.get(i-low);
        }
        return cnt;
    }
    public static int mergeSort(long[] arr, int low, int high){
        int cnt = 0;
        if(low >= high){
            return cnt;
        }
        int mid = (low + high)/2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return mergeSort(arr, 0, n-1);
    }
}
