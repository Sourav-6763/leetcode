class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                map.put(i, val + 1);
            } else {
                map.put(i, 1);
            }
        }
        int res=0;
        int max = nums.length/2;
        for (Integer key : map.keySet()) {
            if (max<map.get(key)) {
               res= key;
            }

        }
        return res;
    }
}