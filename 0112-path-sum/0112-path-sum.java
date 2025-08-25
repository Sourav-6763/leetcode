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
        boolean res = solver(root, targetSum, 0);
        return res;
    }

    public boolean solver(TreeNode root, int targetSum, int sum) {
        if (root == null)
            return false;
            sum += root.val;
        if (sum == targetSum && root.left == null && root.right == null) {
            return true;
        }
         if (root.left == null && root.right == null) {
            return false;
        }
        return solver(root.left, targetSum, sum) ||
                solver(root.right, targetSum, sum);
    }
}