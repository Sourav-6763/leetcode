class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> ab=new HashSet<Integer>();
        while(n!=1 && !ab.contains(n)){
            ab.add(n);
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum=sum+(digit*digit);
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}