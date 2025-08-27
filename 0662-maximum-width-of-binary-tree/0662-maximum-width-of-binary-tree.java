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
class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair> deque = new LinkedList<>();
        int max=0;
        deque.offerLast(new Pair(root,0));
        while (!deque.isEmpty()) {
            int size=deque.size();
            int start=deque.peekFirst().index;
            int last=deque.peekLast().index;
            max=Math.max(max,last-start+1);
            for(int i=0;i<size;i++){
               Pair p=deque.pollFirst();
               TreeNode temp=p.node;
               int idx=p.index;
              if(temp.left!=null) deque.offerLast(new Pair(temp.left,(2*idx)+1));
              if(temp.right!=null) deque.offerLast(new Pair(temp.right,(2*idx)+2));
            }
        }
return max;
    }
}