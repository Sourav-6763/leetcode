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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int count =0;
        Queue<TreeNode> ab=new LinkedList<>();
        ab.offer(root);
        while(!ab.isEmpty()){
            count++;
            int size=ab.size();
            int i=0;
            while(i<size){
                TreeNode temp=ab.poll();
                if(temp.left!=null) ab.offer(temp.left);
                if(temp.right!=null) ab.offer(temp.right);
                i++;
                if(temp.left==null && temp.right==null) return count;
            }
        }
        return 1;
    }
}