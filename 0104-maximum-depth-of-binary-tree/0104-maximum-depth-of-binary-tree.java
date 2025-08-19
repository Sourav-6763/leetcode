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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> ab = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        int count = 0;
        ab.offer(root);
        while (!ab.isEmpty()) {
            int size = ab.size();
            int i=0;
            while (i < size) {
                TreeNode temp = ab.poll();
                if (temp.left != null)
                    ab.offer(temp.left);
                if (temp.right != null)
                    ab.offer(temp.right);
                i++;
            }

            count++;

        }
        return count;

    }
}