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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        solver(res,0,root);
        return res;
    }
    public void solver(List<Integer>res,int Idx,TreeNode root){
        if(root==null) return ;
        if(Idx>=res.size()) res.add(root.val);
        solver(res,Idx+1,root.right);
        solver(res,Idx+1,root.left);
    }
}