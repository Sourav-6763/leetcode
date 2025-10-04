class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> ab=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ab.add(nums[i]*nums[i]);
        }
        int [] res=new int [ab.size()];
        Collections.sort(ab);
        for(int i=0;i<ab.size();i++){
            res[i]=ab.get(i);
        }
        return res;
    }
}