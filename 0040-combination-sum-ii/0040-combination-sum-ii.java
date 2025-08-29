class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ab=new ArrayList<>();
        solver(candidates,target,ab,0,new ArrayList<>());
        return ab;
    }
    public void solver(int [] candidates,int target,List<List<Integer>> ab,int idx,List<Integer> demo){
        if(target==0){
            ab.add(new ArrayList<>(demo));
            return ;
        }
        if(candidates.length==idx  || target<0){
            return ;
        }
        
        demo.add(candidates[idx]);
        solver(candidates,target-candidates[idx],ab,idx+1,demo);
        demo.remove(demo.size()-1);
        int nextIdx=idx+1;
        while(candidates.length> nextIdx && candidates[idx]==candidates[nextIdx]){
            nextIdx++;
        }
        solver(candidates,target,ab,nextIdx,demo);
    }
}