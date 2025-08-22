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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ab = new ArrayList<>();
        if (root == null) return ab;
        Queue<TreeNode> temp = new LinkedList<>();
        temp.offer(root);
        while(!temp.isEmpty()){
          int size=temp.size();
          int i=0;
          double sum=0;
          while(i<size){
            TreeNode demo=temp.poll();
            sum+=demo.val;
            if(demo.left!=null) temp.offer(demo.left);
            if(demo.right!=null) temp.offer(demo.right);
            i++;
          }
           ab.add(sum/size);
        }
        return ab;
    }
}