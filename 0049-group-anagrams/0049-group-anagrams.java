class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(strs[i]);
            }
            else{
                 List<String> demo=new ArrayList<>();
                 demo.add(strs[i]);
                 map.put(sortedStr,demo);
            }
        }
        for(String i:map.keySet()){
            res.add(map.get(i));
        }
        
        return res;
    }
}