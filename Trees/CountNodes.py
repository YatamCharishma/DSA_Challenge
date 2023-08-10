class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int:
        def traversal(node):
            if(node != None):
                return 1 + traversal(node.left) + traversal(node.right)
            return 0
        return traversal(root)
