class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> pree = new ArrayList<>();
        ArrayList<Integer> suff = new ArrayList<>(Collections.nCopies(nums.length, 1));
        pree.add(1);
        for (int i = 1; i < nums.length; i++) {
            pree.add(pree.get(i - 1) * nums[i - 1]);
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            suff.set(i, suff.get(i + 1) * nums[i + 1]);
        }
        int[] result = new int[nums.length];
      for(int i=0;i<nums.length;i++){
         result[i]=pree.get(i)*suff.get(i);
      }
        return result;
    }
}