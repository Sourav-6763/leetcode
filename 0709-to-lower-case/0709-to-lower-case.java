class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i);
            if(a>=65 && a<=90){
                char q = (char) (a + 32);
                sb.append(q);
               // System.out.println(q);
            }else{

            
            sb.append(s.charAt(i));
            }
        }
        // System.out.println(sb);
        return sb.toString();
    }
}