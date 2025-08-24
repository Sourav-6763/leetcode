class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ab = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length -1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> demo = new ArrayList<>();
                    demo.add(nums[i]);
                    demo.add(nums[left]);
                    demo.add(nums[right]);
                    ab.add(demo);
                    right--;
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(ab);
    }
}