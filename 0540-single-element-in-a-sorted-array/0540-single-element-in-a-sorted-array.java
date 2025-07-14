class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            boolean isEven=(mid%2)==0;
           if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) {
                if(isEven){
                    left=mid+2;
                }
                else{
                    right=mid-1;
                }
            }
            else {
                if(isEven){
                    right=mid;
                }
                else{
                     left=mid+1;
                }
            }
        }
        return nums[left];
    }
}