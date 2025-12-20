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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> ab = new ArrayList<>();
        solver(root, ab);
        ab.get(0).left=null;
        for(int i=1;i<ab.size();i++){
            ab.get(i).left=null;
            ab.get(i-1).right=ab.get(i);
        }
        ab.get(ab.size()-1).right=null;
        return ab.get(0);
    }

    public void solver(TreeNode root, ArrayList<TreeNode> ab) {
        if (root == null) {
            return;
        }
        solver(root.left, ab);
        ab.add(root);
        solver(root.right, ab);
    }
}