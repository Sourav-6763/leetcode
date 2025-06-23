class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int result=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int j = 0;
                j++;
                map.put(nums[i], j);
            } else if (map.containsKey(nums[i])) {
                Integer a = map.get(nums[i]);
                int b = a + 1;
                map.put(nums[i], b);
            }

        }
       Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            if (map.get(key) == 2) {
                result=result^key;
            }
        }
        


        
        return result;
    }
}