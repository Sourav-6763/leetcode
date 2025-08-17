import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String num="";
        for(int i:digits){
            num+=i;
        }
        BigInteger numA = new BigInteger(num);
           numA = numA.add(BigInteger.ONE);
        String res=numA.toString();
       int[] result = new int[res.length()];
        for (int i = 0; i < res.length(); i++) {
            result[i] = Character.getNumericValue(res.charAt(i));
        }
   
        return result;
    }
}