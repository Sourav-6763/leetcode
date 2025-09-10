class Solution {
    public int maxDistance(int[] colors) {
        int res=0;
        int n=colors.length;
        for(int j=0;j<n;j++){
            if(colors[j]!=colors[n-1]){
                res=Math.max(res,(n-1)-j);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(colors[0]!=colors[i]){
                res=Math.max(res,i-0);
            }
        }
        return res;
    }
}