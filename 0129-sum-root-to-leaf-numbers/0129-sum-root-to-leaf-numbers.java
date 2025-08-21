class Solution {
    public int sumNumbers(TreeNode root) {
        return solver(root, new StringBuilder());
    }

    private int solver(TreeNode root, StringBuilder path) {
        if (root == null) return 0;

        // append current node value
        path.append(root.val);

        int sum = 0;
        if (root.left == null && root.right == null) {
            // leaf node: convert path to number
            sum = Integer.parseInt(path.toString());
        } else {
            sum += solver(root.left, path);
            sum += solver(root.right, path);
        }

        // backtrack
        path.deleteCharAt(path.length() - 1);
        return sum;
    }
}
