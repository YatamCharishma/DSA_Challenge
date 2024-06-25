/** Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 
**/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//Found mid, reverse second half of linked list, add up every node of two halfs, and compare with max.

class Solution {
    public ListNode reverse(ListNode head){
        ListNode rev = head;
        if(head == null || head.next == null){
            return head;
        }
        rev = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public int pairSum(ListNode head) {
        if(head.next.next == null){
            return head.val + head.next.val;
        }
        int maxx = 0;
        ListNode right = mid(head);
        right = reverse(right);
        ListNode left = head;
        while(right != null){
            if(left.val+right.val > maxx){
                maxx = left.val+right.val;
            }
            left = left.next;
            right = right.next;
        }
        return maxx;
    }
}
