class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ab = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digi = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digi1 = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = digi + digi1 + carry;
            carry = sum / 2;
            ab.append(sum % 2);
            i--;
            j--;
        }
        return ab.reverse().toString();
    }
}