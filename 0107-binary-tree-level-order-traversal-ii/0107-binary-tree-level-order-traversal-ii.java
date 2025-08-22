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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ab=new ArrayList<>();
        if(root==null)return ab;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> ab2=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                ab2.add(temp.val);
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null)queue.offer(temp.right);
            }
            ab.add(ab2);
        }
        Collections.reverse(ab);
        return ab;
    }
}