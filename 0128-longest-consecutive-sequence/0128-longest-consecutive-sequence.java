import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, false);
        }

        int maxLength = 0;

        for (int num : nums) {
            if (map.get(num)) continue;

            int count = 1;
            map.put(num, true);

            // Expand backward
            int left = num - 1;
            while (map.containsKey(left) && !map.get(left)) {
                map.put(left, true);
                count++;
                left--;
            }

            // Expand forward
            int right = num + 1;
            while (map.containsKey(right) && !map.get(right)) {
                map.put(right, true);
                count++;
                right++;
            }

            maxLength = Math.max(maxLength, count);
        }

        return maxLength;
    }
}
