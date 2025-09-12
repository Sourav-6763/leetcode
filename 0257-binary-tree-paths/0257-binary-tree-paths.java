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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        solver(root,res,"");
        System.out.println(res);
        return res;
    }
    public void solver(TreeNode root, List<String> res, String demo){
        if(root==null) return ;
        demo=demo+root.val;
        if(root.left==null && root.right==null){
            res.add(demo);
            return;
        }
        demo = demo + "->";
        solver(root.left,res,demo);
        solver(root.right,res, demo);
    }
}