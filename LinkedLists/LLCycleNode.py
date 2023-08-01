#Return the node where the cycle begin
def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        flg = 0
        while(fast != None and fast.next != None):
            fast = fast.next.next
            slow = slow.next
            if(slow == fast):
                flg = 1
                break
        if(flg==0):
            return None
        else:
            while(head != slow):
                slow = slow.next
                head = head.next
            return head
