// A binary tree is uni-valued if every node in the tree has the same value.
// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(isUnival(root, root.val)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isUnival(TreeNode root, int rootval){
        if(root == null){
            return true;
        }
        if(root.val != rootval){
            return false;
        }
        return isUnival(root.left, rootval) && isUnival(root.right, rootval);
    }
}
