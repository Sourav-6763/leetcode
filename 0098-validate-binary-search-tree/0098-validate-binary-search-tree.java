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
    public boolean isValidBST(TreeNode root) {
        List<Integer> ab = new ArrayList<>();
        solver(root, ab);
        for (int i = 1; i < ab.size(); i++) {
            if (ab.get(i) <= ab.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void solver(TreeNode root, List<Integer> ab) {
        if (root == null)
            return;
        solver(root.left, ab);
        ab.add(root.val);
        solver(root.right, ab);
    }
}