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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null ) return false;
        if(root.right == null && root.left == null){
            if(targetSum==root.val){
                return true;
            }else{
                return false;
            }
        }
        boolean ans1 = hasPathSum(root.left,targetSum-root.val);
        boolean ans2 = hasPathSum(root.right,targetSum-root.val);
        return ans1 || ans2;
    }
}