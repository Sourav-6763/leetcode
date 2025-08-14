class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if(k==0) return;
         k = k%length;
            rev(nums, 0, length - 1);
            rev(nums, 0, k - 1);
            rev(nums, k ,length-1);
  

    }

    public void rev(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
}