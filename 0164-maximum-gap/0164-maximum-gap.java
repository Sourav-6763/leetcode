class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            int i = j + 1;
            int val = (nums[i] - nums[j]);
            if (val > max) {
                max = val;
                System.out.println(max);
            }

        }

        return max;
    }
}