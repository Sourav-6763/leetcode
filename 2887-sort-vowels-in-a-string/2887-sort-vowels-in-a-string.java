class Solution {
    public String sortVowels(String s) {
        StringBuilder ab = new StringBuilder();
        List<Character> sb=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
                    s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                    s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                sb.add(s.charAt(i));
                ab.append('#');

            }
            else{
                ab.append(s.charAt(i));
            }
            

        }
        int j=0;
        Collections.sort(sb);
        for(int i=0;i<ab.length();i++){
            if(ab.charAt(i)=='#'){
                ab.setCharAt(i,sb.get(j));
                j++;
            }
        }
        return ab.toString();
    }
}