class Solution {
    public int minElement(int[] nums) {
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int b=nums[i];
            String s=Integer.toString(b);
            int sum=0;
            for(int j=0;j<s.length();j++){
                int num = s.charAt(j) - '0';
                sum=sum+num;
                if(j==s.length()-1){
                    a.add(sum);
                }
               
            }
            
        }
        return Collections.min(a);
    }
}