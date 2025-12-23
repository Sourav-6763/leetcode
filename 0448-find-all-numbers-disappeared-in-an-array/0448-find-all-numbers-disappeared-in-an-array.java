class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        Boolean [] demo=new Boolean[nums.length+1];
        for(int i=0;i<demo.length;i++){
            demo[i]=false;
        }
        for(int i=0;i<nums.length;i++){
            demo[nums[i]]=true;
        }
        for(int i=1;i<demo.length;i++){
            if(demo[i]==false){
                result.add(i);
            }
        }
        return result;
    }
}