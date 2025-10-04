class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int [] res=new int [nums.length];
        while(i<=j){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];
            if(a>b){
                res[k]=a;
                i++;
                k--;
            }else{
                res[k]=b;
                k--;
                j--;
            }
        }
        return res;
    }
}