def minDepth(self, root: Optional[TreeNode]) -> int:
        mini = float("inf")
        if(root == None):
            return 0
        def depth(root, lev = 0):
            nonlocal mini
            if(root == None):
                return 0
            if(root.left == None and root.right == None):
                mini = min(mini, lev)
            else:
                depth(root.left, lev+1)
                depth(root.right, lev+1)
            return
        depth(root)
        return mini+1
