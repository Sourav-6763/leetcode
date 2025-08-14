class Solution {
    public int findPeakElement(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}