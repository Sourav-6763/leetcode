class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        int sum=0;
        solver(candidates,target,res,new ArrayList<>(),0,sum);
        return res;
    }
    public void solver(int[] candidates,int target,List<List<Integer>> res,List<Integer> demo,int idx,int sum){
        if(idx==candidates.length || target<sum) return ;
        if(sum==target) {
            res.add(new ArrayList<>(demo));
            return ;
        }
        demo.add(candidates[idx]);
        solver(candidates,target,res,demo,idx,sum+candidates[idx]);
        demo.remove(demo.size()-1);
        solver(candidates,target,res,demo,idx+1,sum);
    }
}