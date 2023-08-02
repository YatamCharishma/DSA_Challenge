# Given the head of a singly linked list, return the middle node of the linked list.
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        tmp = head
        l1 = 0
        while(tmp!=None):
            l1+=1
            tmp = tmp.next

        while(fast.next!=None and fast.next.next!=None):
            slow = slow.next
            fast = fast.next.next
        if(l1%2!=0):
            return slow
        return slow.next
