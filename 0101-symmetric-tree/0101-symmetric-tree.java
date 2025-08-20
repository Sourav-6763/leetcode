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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
       boolean res= solver(root.left,root.right);
       return res;
    }
    public boolean solver(TreeNode Tleft,TreeNode Tright){
        if (Tleft == null && Tright == null) return true;
          if (Tleft == null || Tright == null) return false;
        if(Tleft.val!=Tright.val) return false;
       return solver(Tleft.left, Tright.right) && solver(Tleft.right, Tright.left);
    }
}