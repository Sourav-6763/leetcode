class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        if (nums.length <= 0)
            return res;
        int left = 0;
        int right = nums.length - 1;
        int[] res2 = new int[2];
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                int i = mid;
                while ((i - 1 >= 0) && (nums[i - 1] == target)) {
                    i--;
                }
                res2[0] = i;
                int j = mid;
                while ((j + 1 < nums.length) && (nums[j + 1] == target)) {
                    j++;
                }
                res2[1] = j;
                return res2;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}