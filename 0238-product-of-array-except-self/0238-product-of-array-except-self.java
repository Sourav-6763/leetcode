class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int [] pref=new int [n];
        int [] suf=new int [n];
        int [] res=new int [n];
        pref[0]=1;
        for(int i=1;i<arr.length;i++){
            pref[i]=arr[i-1]*pref[i-1];
        }
        suf[n-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            suf[i]=arr[i+1]*suf[i+1];
        }
        for(int i=0;i<arr.length;i++){
            res[i]=pref[i]*suf[i];
        }
        return res;
    }
}