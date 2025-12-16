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
    private int sum=0;
    public int sumNumbers(TreeNode root) {
        solver(root, 0);
        return sum;
    }

    public void solver(TreeNode root, int cur) {
        if(root==null) return ;
        cur=cur*10+root.val;
        if(root.left==null&& root.right==null){
            sum+=cur;
        }
        solver(root.right,cur);
        solver(root.left,cur);
       
    }
}