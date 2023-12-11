# Reverse polish notation
def evalRPN(self, tokens: List[str]) -> int:
        lst = []
        for i in tokens:
            if i == '+':
                lst.append(int(lst.pop()+lst.pop()))
            elif i == '-':
                a, b = lst.pop(), lst.pop()
                lst.append(int(b - a))
            elif i == '*':
                lst.append(int(lst.pop()*lst.pop()))
            elif i == '/':
                a, b = lst.pop(), lst.pop()
                lst.append(int(b / a))
            else:
                lst.append(int(i))
        return lst[-1]
