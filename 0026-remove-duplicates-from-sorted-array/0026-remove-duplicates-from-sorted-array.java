class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int i = 0;
        for (int k = 0; j < nums.length; k++) {
                if (nums[j] == nums[i] ) {
                    j++;
                } else {
                    i++;
                    nums[i] = nums[j];
                }
        }
        return i+1;
    }
}