class Solution {
    public int trap(int[] height) {
        int n=height.length-1;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int max = 0;
        for (int i : height) {
            max=Math.max(max, i);
            left.add(max);

        }
        int max2 = 0;
        for (int i=n;i>=0;i--) {
            max2=Math.max(max2, height[i]);
            right.add(max2);

        }
        Collections.reverse(right);
        int sum=0;
        for(int i=0;i<n;i++){
            int Min=Math.min(left.get(i),right.get(i));
            sum+=Min-height[i];
        }
        return sum;
    }
}