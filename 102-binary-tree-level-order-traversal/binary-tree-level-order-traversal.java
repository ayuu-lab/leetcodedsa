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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> temp = new LinkedList<>();
        temp.offer(root);
        while (!temp.isEmpty()) {
            List<Integer> cur = new ArrayList<>();
            int size = temp.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp1 = temp.poll();
                if (temp1 != null) {
                    cur.add(temp1.val);
                    if (temp1.left != null) {
                        temp.offer(temp1.left);
                    }
                    if (temp1.right != null) {
                        temp.offer(temp1.right);
                    }
                }

            }
            ans.add(new ArrayList<>(cur));
        }
        return ans;
    }
}