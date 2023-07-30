#Input: head = [1,2,3,4,5], n = 2
#Output: [1,2,3,5]
#Nth dode from end means length of linked list minus n from beginning
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        tmp = head
        cur = head
        cnt = 0
        while(tmp!=None):
            cnt+=1
            tmp = tmp.next
        cnt = cnt - n
        if(cnt == 0):
                head = head.next
        while(cnt >= 0):
            if(cnt == 1):
                cur.next = cur.next.next
            else:
                cur = cur.next
            cnt -= 1
        return head
