class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pree = new int[n];
        int[] suff = new int[n];
        pree[0] = 1;
        for (int i = 0; i < n-1; i++) {
            pree[i + 1] = nums[i] * pree[i];
        }
        suff[n-1]=1;
        for(int i=n-1;i>0;i--){
            suff[i-1]=suff[i]*nums[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(suff[i]);
        }
        for(int i=0;i<n;i++){
            res[i]=pree[i]*suff[i];
        }
        return res;
    }
}