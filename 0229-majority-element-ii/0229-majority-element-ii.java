class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer> ab=new ArrayList<>();
        for(int i:nums){
            if(map.containsKey(i)){
                int val=map.get(i);
                map.put(i,val+1);
            }
            else{
                map.put(i,1);
            }
            
        }
        for(int i:map.keySet()){
            if(n/3<map.get(i)){
                ab.add(i);
            }
           
        }
        // System.out.println(map);
        return ab;
    }
}