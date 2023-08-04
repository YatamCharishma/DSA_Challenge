class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        if(head == None):
            return
        prev = None
        tmp = head
        while(tmp):
            if(tmp.val == val):
                if(prev):
                    prev.next = tmp.next
                else:
                    head = head.next
                tmp = tmp.next
            else:
                prev = tmp
                tmp = tmp.next
        return head
