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
    private int maxLevel = -1;
    private int res = 0;
    public int findBottomLeftValue(TreeNode root){

        solver(root,1);
        return res;
    }

    public void solver(TreeNode root,int level){
        if(root==null){
          return;
        }
        if(maxLevel<level){
            maxLevel=level;
            res=root.val;
        }
        solver(root.left,level+1);
        solver(root.right,level+1);
    }
    
}