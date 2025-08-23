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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int j = 0;
        while (!queue.isEmpty()) {
            Stack<Integer> stack = new Stack<>();
            List<Integer> gg = new ArrayList<>();
            int size = queue.size();
            j++;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
                if (j % 2 == 0) {
                    stack.push(temp.val);
                } else {
                    gg.add(temp.val);
                }
            }
            while (!stack.isEmpty()) {
                gg.add(stack.pop());
            }
            res.add(gg);
        }

        return res;
    }
}