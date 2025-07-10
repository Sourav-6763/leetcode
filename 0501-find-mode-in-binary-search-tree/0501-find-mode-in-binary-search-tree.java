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
    public int[] findMode(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        helper(root, res,map);
         int maxValue = 0;
        for (int value : map.values()) {
            maxValue = Math.max(maxValue, value);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == maxValue) {
                res.add(key);
            }
        }

        int[] array = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }
        return array;
    }

    public void helper(TreeNode root, List<Integer> res, HashMap<Integer, Integer> map) {
        if (root == null)
            return;
        helper(root.left, res,map);
        if (map.containsKey(root.val)) {
            int temp = map.get(root.val);
            map.put(root.val, ++temp);
        } else {
            map.put(root.val, 1);
        }
        helper(root.right, res,map);
    }
}