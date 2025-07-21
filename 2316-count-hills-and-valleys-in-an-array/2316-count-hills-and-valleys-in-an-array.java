class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> ab=new ArrayList<>();
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] !=nums[i]){
                ab.add(nums[i-1]);
            }
            if(nums.length-1==i){
                ab.add(nums[nums.length-1]);
            }
        }
        for (int i = 1; i <= ab.size() - 2; i++) {
            if ((ab.get(i - 1) < ab.get(i) && ab.get(i) > ab.get(i + 1)) || (ab.get(i - 1) > ab.get(i) && ab.get(i) < ab.get(i + 1))) {
                count++;
            }
        }
        return count;
    }
}