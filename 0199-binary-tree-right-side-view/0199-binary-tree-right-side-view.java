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
        List<Integer> ab =new ArrayList<>();
        solver(root,ab,0);
        return ab;
    }
    public void solver(TreeNode root,List<Integer> ab,int idx){
        if(root==null) return ;
        if(idx>=ab.size()){
            ab.add(root.val);
        }
        solver(root.right,ab,idx+1);
        solver(root.left,ab,idx+1);

    }
}