class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                map.put(i, val + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : map.keySet()) {
            if (map.get(i) % 2 != 0) {

                return false;
            }
        }
        return true;
    }
}