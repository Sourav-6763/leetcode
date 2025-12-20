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
    private int count=0;
    public int countNodes(TreeNode root) {
        solver(root);
        // System.out.println(a);
        return count;
    }
    public void solver(TreeNode root){
        if(root==null) return ;
        count++;
        solver(root.left);
        solver(root.right);
        // return count;
    }
}