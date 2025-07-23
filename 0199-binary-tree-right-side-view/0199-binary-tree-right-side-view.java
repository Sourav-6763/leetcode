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
        solver(root,res,1);
        return res;
    }
    public void solver(TreeNode root,List<Integer> res,int leble){
        if(root==null) return ;
        if(res.size()<leble){
            res.add(root.val);
        }
        solver(root.right,res,leble+1);
        solver(root.left,res,leble+1);

    }
}