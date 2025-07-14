class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        int sum=0;
        while(left<right){
            if(height[left]<height[right]){
                int minn=Math.min(height[left],height[right]);
                sum=Math.max(sum,minn*(right-left));
                left++;
            }
            else{
                int minn=Math.min(height[left],height[right]);
                sum=Math.max(sum,minn*(right-left));
                right--;
            }
        }
        return sum;
    }
}