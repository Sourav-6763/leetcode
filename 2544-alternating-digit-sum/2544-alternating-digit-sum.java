class Solution {
    public int alternateDigitSum(int n){
        int sum=0;
        String num=Integer.toString(n);
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                sum+=(num.charAt(i)-'0');
            }else{
                sum-=num.charAt(i)-'0';
            }
        }
        return sum;
    }
}