class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        HashMap<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int j = 0;
                j++;
                map.put(nums[i], j);
            } else if (map.containsKey(nums[i])) {
                Integer a = map.get(nums[i]);
                int b=a+1;
                map.put(nums[i], b);
            }
             
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                res=nums[i];
            }
        }
        return res;
    
    }
}