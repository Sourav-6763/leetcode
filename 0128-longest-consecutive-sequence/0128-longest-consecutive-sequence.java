class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        if (nums.length == 0)
            return 0;
        int max = 0;
        for (int i : nums) {
            map.put(i, false);
        }
        for (int i : nums) {
            // if (map.get(i))
            //     continue;
            int count = 1;
            int left = i-1;
             
            while (map.containsKey(left) && map.get(left) == false) {
                map.put(left, true);
                count++;
                left--;

            }

            int right = i+1;
            while (map.containsKey(right) && map.get(right) == false) {
                map.put(right, true);
                count++;
                right++;
                

            }
            max = Math.max(count, max);

        }
        return max ;
    }
}