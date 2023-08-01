def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        l1 = 0
        l2 = 0
        curA = headA
        curB = headB
        while(curA!=None):
            curA = curA.next
            l1+=1
        while(curB!=None):
            curB = curB.next
            l2+=1
        cur1 = headA
        cur2 = headB
        if(l1>l2):
            dif = l1-l2
            while(dif>0):
                cur1 = cur1.next
                dif = dif-1
        elif(l2>l1):
            dif = l2-l1
            while(dif>0):
                cur2 = cur2.next
                dif = dif-1
        while(cur1!=None and cur2!=None):
            if(cur1!=cur2):
                cur1 = cur1.next
                cur2 = cur2.next
            else:
                break
        if(cur1==None or cur2==None):
            return 
        return cur1

    def lengthoflst(h1):
        cnt = 0
        while(h1!=None):
            h1 = h1.next
            cnt+=1
        return cnt
