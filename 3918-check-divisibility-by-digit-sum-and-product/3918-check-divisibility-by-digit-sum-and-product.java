class Solution {
    public boolean checkDivisibility(int n) {
        int originalnum=n;
        int rev=0;
        int rem;
        int mul=1;
        int totalsum;
        int sum=0;
        while(n>0){
          rem = n % 10;
          sum=sum+rem;
          mul=mul*rem;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
           System.out.println(mul);
              System.out.println(sum);
        totalsum=sum+mul;
        return (originalnum%totalsum)==0?true:false;
    }
}