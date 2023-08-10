class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.symmetric(root.left, root.right)

    def symmetric(self, l, r):
        if l == None and r == None:
            return True
        if l != None and r != None and l.val == r.val:
            return self.symmetric(l.left, r.right) and self.symmetric(l.right, r.left)
        return False
