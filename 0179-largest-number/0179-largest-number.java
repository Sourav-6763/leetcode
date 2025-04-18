class Solution {
    public String largestNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                String A =Integer.toString(nums[i]);
                String B =Integer.toString(nums[j]);
                if((A+B).compareTo(B+A)<0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        if (nums[0] == 0) return "0";
       StringBuilder result = new StringBuilder();
       for(int num :nums){
        result.append(num);
       }
        return result.toString();
    }
}