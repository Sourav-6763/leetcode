class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> map=new HashMap<>();
         for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1);
            } else {
                map.put(digit, 1);
            }
        }
        for(int i=0;i<num.length();i++){
            int digit =num.charAt(i) - '0';
            int actual=map.containsKey(i)?map.get(i):0;
            if(actual != digit){
               return false; 
            }
        }
        return true;
    }
}