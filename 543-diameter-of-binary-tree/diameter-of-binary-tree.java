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
    int diameter = 0;
    public int solve(TreeNode root){
        if(root == null) return 0;
        int lft = solve(root.left);
        int ryt = solve(root.right);
        diameter = Math.max(diameter,lft+ryt);
        return Math.max(lft,ryt)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return diameter;
    }
}