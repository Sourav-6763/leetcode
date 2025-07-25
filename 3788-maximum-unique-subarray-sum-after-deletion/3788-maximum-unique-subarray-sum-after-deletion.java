class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> ab=new HashSet<>();
        int sum=0;
        if(nums.length==1) return nums[0];
        Boolean checkNeg=false;
        int countNeg=0;
        int neg=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>=0){
                ab.add(i);
            }
            if(i<0){
                countNeg++;
                if(i>neg){
                    neg=i;
                }
            }
        }
        for(int i:ab){
            sum+=i;
        }
        if(nums.length==countNeg){
            checkNeg=true;
        }

        return checkNeg?neg:sum;
    }
}