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
        int height = 0;
        if (root == null)
            return 0;
            ab.offer(root);
        while (!ab.isEmpty()) {
            int size = ab.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = ab.poll();      
                if (temp.left != null)
                    ab.offer(temp.left);
                if (temp.right != null)
                    ab.offer(temp.right);
            }
            height++;
        }
        return height;
    }
}