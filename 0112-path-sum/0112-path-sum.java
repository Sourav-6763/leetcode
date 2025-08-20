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
         if (root == null) return false;
        int sum=root.val;
        boolean res=solver(root,targetSum,sum);
        return res;
    }
    public boolean solver(TreeNode root,int targetSum,int sum){
        if (root == null) return false; 
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                return true;
            }
        }
         return (root.left != null && solver(root.left, targetSum, sum + root.left.val)) ||
               (root.right != null && solver(root.right, targetSum, sum + root.right.val));

    }
}