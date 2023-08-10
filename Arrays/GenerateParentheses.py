class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        def generate(l, r, tmp):
            nonlocal res
            if(l == 0 and r==0):
                res.append(tmp)
            if(l > 0):
                generate(l-1, r, tmp+"(")
            if(r > l):
                generate(l, r-1, tmp+")")
        generate(n, n, "")
        return res
