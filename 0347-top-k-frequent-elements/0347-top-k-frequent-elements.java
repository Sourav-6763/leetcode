class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val=map.get(nums[i]);
                map.put(nums[i],val+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> entries =new ArrayList<>(map.entrySet());
        int [] res=new int[k];
        Collections.sort(entries,(a,b) ->b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            res[i]=entries.get(i).getKey();
        }
        return res;
    }
}