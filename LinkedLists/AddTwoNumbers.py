#Input: l1 = [2,4,3], l2 = [5,6,4]
#Output: [7,0,8]
#Explanation: 342 + 465 = 807.

# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)
        cur = dummy
        carry = 0
        while(l1 != None or l2 != None or carry):
            sum = 0
            if(l1 != None):
                sum += l1.val
                l1 = l1.next
            if(l2 != None):
                sum += l2.val
                l2 = l2.next
            sum += carry
            carry = sum // 10
            cur.next = ListNode(sum%10)
            cur = cur.next
        return dummy.next
