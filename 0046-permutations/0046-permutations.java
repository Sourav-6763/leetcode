class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ab=new ArrayList<>();
        helper(ab,nums,new ArrayList<>());
        return ab;
    }

    public void helper(List<List<Integer>> ab,int[] nums,ArrayList<Integer> temp){
        if(temp.size()== nums.length){
            ab.add(new ArrayList<Integer>(temp));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            helper(ab,nums,temp);
            temp.remove(temp.size()-1);
        }
      
    }
}