class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int val=map.get(s.charAt(i));
                map.put(s.charAt(i),val+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        StringBuilder res=new StringBuilder();
        List<Map.Entry<Character,Integer>> demo=new ArrayList<>(map.entrySet());
        Collections.sort(demo,(a,b)->b.getValue()-a.getValue());
        for(int i=0;i<demo.size();i++){
            int val=demo.get(i).getValue();
            // System.out.println(val);
            while(val>0){
                 res.append(demo.get(i).getKey());
                 val--;
            }
        }
        return res.toString();
    }
}