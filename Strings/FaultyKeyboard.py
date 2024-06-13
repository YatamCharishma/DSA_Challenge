#Input: s = "string"
#Output: "rtsng"
#Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written.
def finalString(self, s: str) -> str:
        res = ""
        for i in range(len(s)):
            if(s[i] != 'i'):
                res += s[i]
            else:
                res = res[::-1]
        return res
