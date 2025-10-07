class Solution {
    public int[] countBits(int n) {
        int [] res=new int [n+1];
        for(int i=0;i<=n;i++){
            res[i]=gen(i);
        }
        
        return res;
    }

    public int gen(int x) {
        int count = 0;
        while (x != 0) {
            x = x & (x - 1);
            count++;
        }
        return count;
    }
}