class Solution {
    public boolean canJump(int[] nums) {
        int MaxReach=0;
        for(int i=0;i<nums.length;i++){
            if(i>MaxReach){
                return false;
            }
            if(MaxReach<nums[i]+i){
                MaxReach=nums[i]+i;
            }
            
        }
        return true;
    }
}