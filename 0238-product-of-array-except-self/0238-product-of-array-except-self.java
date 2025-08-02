class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        List<Integer> prefix = new ArrayList<>();
        List<Integer> suffix = new ArrayList<>();
        prefix.add(1);
        for (int i = 1; i < nums.length; i++) {
            prefix.add(prefix.get(i - 1) * nums[i - 1]);
        }
        suffix = new ArrayList<>(Collections.nCopies(n, 1));
        for (int i = n - 2; i >= 0; i--) {
           suffix.set(i,suffix.get(i+1)*nums[i+1]);
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = prefix.get(i) * suffix.get(i);
        }
        return result;
    }
}