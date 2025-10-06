class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> pree = new ArrayList<>();
        int [] res=new int[nums.length];
        int [] suff=new int[nums.length];
        for(int i=0;i<suff.length;i++){
            suff[i]=1;
        }
        pree.add(1);
        for(int i=1;i<nums.length;i++){
            pree.add(nums[i-1]*pree.get(i-1));
        }
        for(int i=nums.length-2;i>=0;i--){
            suff[i]=nums[i+1]*suff[i+1];
        }
        for(int i=0;i<res.length;i++){
          res[i]=pree.get(i)*suff[i];
        }
        
        
        return res;
       
    }
}