class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int current_max=nums[0];
        for(int i=1;i<nums.length;i++){
            current_max=Math.max(nums[i],current_max+nums[i]);
            max=Math.max(current_max,max);
        }
        return max;
    }
}