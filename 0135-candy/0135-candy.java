class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        List<Integer> l2r=new ArrayList<>(Collections.nCopies(n,1));
         List<Integer> r2l=new ArrayList<>(Collections.nCopies(n,1));
         for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                int val=l2r.get(i-1);
                l2r.set(i,val+1);
            }
         }
         for(int i=n-2;i>=0;i--){
            if(ratings[i+1]<ratings[i]){
                int val=r2l.get(i+1);
                r2l.set(i,val+1);
            }
         }
         int res=0;
         for(int i=0;i<n;i++){
            int Max=Math.max(l2r.get(i),r2l.get(i));
            res+=Max;
            l2r.set(i,Max);
         }
    
         return res;
    }
}