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
/*
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
*/
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        if (root == null)
            return ans;
        solve(root, cur, ans, targetSum);
        return ans;
    }

    public void solve(TreeNode root, List<Integer> cur, List<List<Integer>> ans, int TS) {
        if (root != null) {
            if (root.right == null && root.left == null) {
                if (TS == root.val) {
                    cur.add(root.val);
                    ans.add(new ArrayList<>(cur));
                    cur.remove(cur.size()-1);
                    return;
                }
                return;
            }
            cur.add(root.val);
            solve(root.left, cur, ans, TS - root.val);
            solve(root.right, cur, ans, TS - root.val);
            cur.remove(cur.size() - 1);
        }
    }
}