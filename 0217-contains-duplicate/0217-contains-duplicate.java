class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ab=new  HashSet<>();
        for(int i:nums){
            if(ab.contains(i)){
                return  true;
            }else{
                ab.add(i);
            }
        }
        return false;
    }
}