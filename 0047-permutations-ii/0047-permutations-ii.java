class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                int count=map.get(i);
                map.put(i,count+1);
            }
            else{
                map.put(i,1);
            }
        }
        List<List<Integer>> ab =new ArrayList<>();
        helper(nums,ab,new ArrayList<>(),map);
        return ab;
    }
    public void helper(int[] nums,List<List<Integer>> ab,ArrayList<Integer> demo,Map<Integer,Integer> map){
        if(nums.length==demo.size()){
            ab.add(new ArrayList<Integer>(demo));
        }
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq == 0) continue;
            
            demo.add(key);
            map.put(key,freq-1);
            helper(nums,ab,demo,map);
            demo.remove(demo.size()-1);
            map.put(key,freq);
        }
    }
}