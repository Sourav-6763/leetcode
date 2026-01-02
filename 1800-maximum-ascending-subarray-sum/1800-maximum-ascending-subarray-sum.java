class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int maxSum=0;
        for(int i=1;i<nums.length;i++){
            maxSum=Math.max(sum,maxSum);
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
            }else{
                sum=0;
                sum+=nums[i];
            }
            maxSum=Math.max(sum,maxSum);
        }
        return Math.max(sum,maxSum);
    }
}