class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            if(nums[i]>nums[i-1]){
                max=Math.max(max,nums[i]-min);
            }
        }
        return max;
    }
}