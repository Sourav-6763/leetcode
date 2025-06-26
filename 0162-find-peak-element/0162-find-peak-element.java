class Solution {
    public int findPeakElement(int[] nums) {
        int idx=0;
        int min = Integer.MIN_VALUE;  // -2147483648
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=min){
                min=nums[i];
                idx=i;
            }
        }
        return idx;
    }
}