class Solution {
    public int maxProduct(int[] nums) {
        int left=1;
        int right=1;
        int idx=nums.length-1;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            left=left==0?1:left;
            right=right==0?1:right;
            left=left*nums[i];
            right=right*nums[idx-i];
            ans=Math.max(ans,Math.max(left,right));
        }
        return ans;
    }
}