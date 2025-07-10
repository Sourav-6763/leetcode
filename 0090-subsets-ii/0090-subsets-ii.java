class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        Set<List<Integer>> res=new HashSet<>();
        helper(nums,0,new ArrayList<>(),res);
        List<List<Integer>> ab=new ArrayList<>(res);
        return ab;
    }
    public void helper(int[] nums,int idx,List<Integer>path,Set<List<Integer>> res){
        if(idx==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        path.add(nums[idx]);
        helper(nums,idx+1,path,res);
        path.remove(path.size()-1);
        helper(nums,idx+1,path,res);
    }
}