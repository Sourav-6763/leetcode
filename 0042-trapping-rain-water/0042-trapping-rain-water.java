class Solution {
    public int trap(int[] arr) {
        int sum=0;
        int n=arr.length;
        int[] leftMax =new int [n];
        int[] rightMax =new int [n];
        int lmax=arr[0];
        for(int i=0;i<n;i++){
            lmax=Math.max(lmax,arr[i]);
            leftMax[i]=lmax;
        }
        int rmax=arr[n-1];
        for(int i=n-1;i>=0;i--){
            rmax=Math.max(rmax,arr[i]);
            rightMax[i]=rmax;
        }
        for(int i=0;i<n;i++){
            int min=Math.min(leftMax[i],rightMax[i]);
            sum+=min-arr[i];
            // System.out.println(rightMax[i]);
        }
        return sum;
    }
}