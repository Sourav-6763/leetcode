class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int idx=0;
        int []result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int res=target-nums[i];
                result[0]=map.get(res);
                result[1]=i;
            }else{
                map.put(nums[i],idx++);
            }
        }
        return result;
    }
}