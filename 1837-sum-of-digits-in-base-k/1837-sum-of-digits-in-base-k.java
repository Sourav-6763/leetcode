class Solution {
    public int sumBase(int n, int k) {
        int sum=0;
        int num=n;
        while(num>0){
            sum+=num%k;
            num=num/k;
        }
        return sum;
    }
}