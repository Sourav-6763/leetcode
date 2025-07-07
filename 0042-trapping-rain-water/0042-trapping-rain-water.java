class Solution {
    public int trap(int[] height) {
        ArrayList<Integer> left=new ArrayList<Integer>();
        ArrayList<Integer> right=new ArrayList<Integer>();
        int leftMax=0;
        for (int i=0;i<height.length;i++){
            leftMax=Math.max(height[i],leftMax);
            left.add(leftMax);
        }
        int rightMax=0;
        for (int i=height.length-1;i>=0;i--){
            rightMax=Math.max(height[i],rightMax);
            right.add(rightMax);
        }
        Collections.reverse(left);
        int sum=0;
        for(int i=0;i<height.length;i++){
            sum+=Math.min(left.get(i),right.get(i))-height[i];
        }
        return sum;
    }
}