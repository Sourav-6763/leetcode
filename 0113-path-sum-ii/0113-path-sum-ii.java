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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        solver(root, targetSum, res, 0, new ArrayList<>());
        return res;
    }

    public void solver(TreeNode root, int targetSum, List<List<Integer>> res, int sum, List<Integer> temp) {
        if (root == null)
            return;
        sum += root.val;
        temp.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                res.add(new ArrayList<>(temp));
            }

        } else {
            solver(root.left, targetSum, res, sum, temp);
            solver(root.right, targetSum, res, sum, temp);
        }

        temp.remove(temp.size() - 1);

    }
}