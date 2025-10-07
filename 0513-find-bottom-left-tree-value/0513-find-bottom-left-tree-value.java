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
    private int res=0;
    private int maxDepth=-1;
    public int findBottomLeftValue(TreeNode root) {
        solver(root,1);
        return res;
    }
    public void solver(TreeNode root,int Idx){
        if(root==null) return;
        if(maxDepth<Idx){
            maxDepth=Idx;
            res=root.val;
        }
        if(root.left!=null)solver(root.left,Idx+1);
        if(root.right!=null)solver(root.right,Idx+1);
    }
}