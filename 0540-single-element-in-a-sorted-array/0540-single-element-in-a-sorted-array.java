class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left < right) {
            int mid = (left + right) / 2;
            boolean isEven;
            if ((right - mid) % 2 == 0) {
                isEven = true;
            }else{
                isEven=false;
            }
            if ((mid+1<n) && (nums[mid] == nums[mid + 1])) {
                if(isEven){
                    left=mid;
                }else{
                    right=mid-1;
                }
            } else {
                if(isEven){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }
        }
        return nums[left];
    }
}