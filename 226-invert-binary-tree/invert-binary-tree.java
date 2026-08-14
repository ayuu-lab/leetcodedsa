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
    public TreeNode ans(TreeNode root) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null)
            return root;
        ans(root.right);
        ans(root.left);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        return root;
    }

    public TreeNode invertTree(TreeNode root) {
        ans(root);
        return root;
    }
}