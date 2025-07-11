class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        solver(candidates,0,res,new ArrayList<>(),target);
        return res;
    }
    public void solver(int[]candidates,int idx,List<List<Integer>> res,List<Integer>path,int target){
         if (idx == candidates.length || target < 0) {
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        path.add(candidates[idx]);
        solver(candidates,idx,res,path,target-candidates[idx]);
        path.remove(path.size()-1);
        solver(candidates, idx + 1, res, path, target);
    }
}