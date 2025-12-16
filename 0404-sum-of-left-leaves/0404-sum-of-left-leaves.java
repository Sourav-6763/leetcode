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
    public int sumOfLeftLeaves(TreeNode root) {
       solver(root,null);
        return sum;
    }
    public void solver(TreeNode current,TreeNode parent){
        if(current==null){
            return ;
        }
        if(current.left==null && current.right==null){
            if(parent!=null&&current==parent.left){
                sum+=current.val;
            }
        }
        solver(current.left,current);
        solver(current.right,current);

    }
}