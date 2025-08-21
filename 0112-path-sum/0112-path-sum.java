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
        if (root == null) {
            return false;
        }
        sum=sum+root.val;
        if(root.left==null &&root.right==null){
           if(sum==targetSum){
            return true;
           }
        }
       boolean left= solver(root.left,targetSum,sum);
       boolean right= solver(root.right,targetSum,sum);
       return left ||right;
    }
}