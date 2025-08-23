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
    public int kthSmallest(TreeNode root, int k) {
        int res = 0;
        List<Integer> ab = new ArrayList<>();
        solver(ab, root);
        res=ab.get(k-1);
        return res;
    }

    public void solver(List<Integer> ab, TreeNode root) {
        if (root == null)
            return;
        solver(ab, root.left);
        ab.add(root.val);
        solver(ab, root.right);
    }
    
}