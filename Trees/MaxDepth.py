ef maxDepth(self, root: Optional[TreeNode]) -> int:
        ans = 0
        if(root == None):
            return 0
        def Depth(node, level):
            nonlocal ans
            if(node != None):
                if(node.left == None and node.right == None):
                    ans = max(ans, level + 1)
                else:
                    Depth(node.left, level + 1)
                    Depth(node.right, level + 1)
            return
        Depth(root, 0)
        return ans
