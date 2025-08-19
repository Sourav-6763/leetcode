class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> temp=new HashSet<>();
        solver(0,temp,new ArrayList<>(),nums);
        List<List<Integer>> res=new ArrayList<>(temp);
        return res;
    }
    public void solver(int idx,Set<List<Integer>> temp ,ArrayList<Integer> demo,int[] nums){
        if(idx==nums.length){
            temp.add(new ArrayList<>(demo));
            return;
        }
        demo.add(nums[idx]);
        solver(idx+1,temp,demo,nums);
        demo.remove(demo.size()-1);
        solver(idx+1,temp,demo,nums);

    }
}