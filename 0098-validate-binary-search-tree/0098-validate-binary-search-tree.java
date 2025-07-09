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
    public boolean isValidBST(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return sortCheck(res);
    }
    public void helper(TreeNode root,List<Integer> res){
        if(root==null)return;
        helper(root.left,res);
        res.add(root.val);
        helper(root.right,res);
    }
   
    public boolean sortCheck(List<Integer> res){
        for(int i=1;i<res.size();i++){
            if(res.get(i-1)>=res.get(i)){
                return false;
            }
            
        }
            return true; 
    }
}