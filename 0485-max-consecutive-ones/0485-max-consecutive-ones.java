class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int cmax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cmax++;
            }
            else{
                max=Math.max(cmax,max);
                cmax=0;
            }
        }
        return max=Math.max(cmax,max);
    }
}