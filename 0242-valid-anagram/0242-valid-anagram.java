class Solution {
    public boolean isAnagram(String s, String t) {
        int A = s.length();
        int B = t.length();
        if (A != B) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < A; i++) {
            if (map.containsKey(s.charAt(i))) {
                int val = map.get(s.charAt(i));
                map.put(s.charAt(i), val + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < B; i++) {
            if (map.containsKey(t.charAt(i))) {
                int val = map.get(t.charAt(i));
                map.put(t.charAt(i), val - 1);
            }
        }
        Boolean allzero=true;
        for(int res :map.values()){
            if(res!=0){
                allzero=false;
            }
            
        }

        return allzero;
    }
}