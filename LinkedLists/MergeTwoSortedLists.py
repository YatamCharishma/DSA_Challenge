# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        p1 = list1
        p2 = list2
        dummy = ListNode(0)
        tmp = dummy
        while(p1!=None and p2!=None):
            if(p1.val<p2.val):
                tmp.next = p1
                p1 = p1.next
            else:
                tmp.next = p2
                p2 = p2.next
            tmp = tmp.next
        if(p1!=None):
            tmp.next = p1
        if(p2!=None):
            tmp.next = p2
        return dummy.next
