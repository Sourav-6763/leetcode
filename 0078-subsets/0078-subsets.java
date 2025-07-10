class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solver(nums, 0, new ArrayList<>(), res);
        return res;
    }

    public void solver(int[] nums, int idx, List<Integer> path, List<List<Integer>> res) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        // Include current element
        path.add(nums[idx]);
        solver(nums, idx + 1, path, res);

        // Exclude current element (backtrack)
        path.remove(path.size() - 1);
        solver(nums, idx + 1, path, res);
    }
}
