class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        solver(candidates,target,res,new ArrayList<>(),0);
        return res;
    }

    public void solver(int [] candidates, int target, List<List<Integer>> res,ArrayList<Integer> demo,int idx){
if(idx==candidates.length || target<0){
return ;
}
if(target==0){
   res.add(new ArrayList<>(demo));
   return;
}
demo.add(candidates[idx]);
solver(candidates,target-candidates[idx],res,demo,idx);
demo.remove(demo.size()-1);
solver(candidates,target,res,demo,idx+1);
    }
}