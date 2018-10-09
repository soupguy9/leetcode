/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //getting better with recursion, still needed help (alg psuedo code/suggestion for helper function)
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) throws IllegalArgumentException {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> ret = new ArrayList<>();
        recursiveHelper(root, ret);
        return ret;
    }
    
    //try a helper function for recursion
    public void recursiveHelper(TreeNode node, List<Integer> ret) {
        if (node.left != null) {
            recursiveHelper(node.left, ret);
        }
        ret.add(node.val);
        if (node.right != null) {
            recursiveHelper(node.right, ret);
        }
    }
}