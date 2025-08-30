class Solution {
    public int trap(int[] height) {
        int n = height.length - 1;
        int sum=0;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int maxL = height[0];
        for (int i = 0; i < height.length; i++){
            maxL=Math.max(height[i],maxL);
            left.add(maxL);
        }
        int maxR = height[n];
        for (int i = n; i >=0; i--){
            maxR=Math.max(height[i],maxR);
            right.add(maxR);
        }
        Collections.reverse(right);
        for(int i=0;i<height.length;i++){
            int min=Math.min(left.get(i),right.get(i));
            sum+=min-height[i];
        }
        return sum;
    }
}