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
    private int height=-1;
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        solver(root,1);
        return height;
    }
    public void solver(TreeNode root,int Idx){
        if(root==null){
            return ;
        }
        if(height<Idx){
            height=Idx;
        }
        if(root.left!=null) solver(root.left,Idx+1);
        if(root.right!=null)solver(root.right,Idx+1);
    }
}