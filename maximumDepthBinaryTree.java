/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Need to understand binary trees better. 
class Solution {
    public int maxDepth(TreeNode root) throws IllegalArgumentException {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        else {
            return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
        }
    }
}