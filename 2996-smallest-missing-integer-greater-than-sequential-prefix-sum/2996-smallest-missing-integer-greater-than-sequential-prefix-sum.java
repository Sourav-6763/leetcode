class Solution {
    public int missingInteger(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // if(map.containKey(nums[i])){

            // }else{
                map.put(nums[i],1);
            // }
        }
       int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==nums[i-1]){
                sum+=nums[i];
            }else{
                break;
            }
        }
        while(map.containsKey(sum)){
          sum++; 
        }
        return sum;
    }
}