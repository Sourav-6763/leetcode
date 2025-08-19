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
    public TreeNode invertTree(TreeNode root) {
        Queue <TreeNode> ab=new LinkedList<>();
        if(root==null) return null;
        ab.offer(root);
       
        while(!ab.isEmpty()){
             TreeNode temp=ab.poll();
             TreeNode temp2=temp.left;
             temp.left=temp.right;
             temp.right=temp2;
             if(temp.left!=null)
             ab.offer(temp.left);
             if(temp.right!=null)
             ab.offer(temp.right);

        }
        return root;
    }
}