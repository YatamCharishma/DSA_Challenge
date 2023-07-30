#Input: head = [1,2,3,4,5]
#Output: [1,3,5,2,4]
#Using Two pointer technique
#Time Complexity : O(N)
#Space Complexity : O(1)
# Definition for singly-linked list.

# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        odd = head
        even = head.next
        evenStart = head.next
        h1 = head.next
        while(even != None):
            if(even.next):
                odd.next = even.next
                odd = odd.next
                even = even.next.next
            else:
                break
            h1.next = even
            h1 = h1.next
        odd.next = evenStart
        return head
