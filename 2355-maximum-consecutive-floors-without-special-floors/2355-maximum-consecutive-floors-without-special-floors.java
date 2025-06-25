class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max = 0;
        int max2=0;
        int max3 = 0;
        int count=0;

        max=(special[0]-bottom);
        for (int i =1; i < special.length; i++) {
          max3=special[i]-special[i-1]-1;
          count = Math.max(count, max3);

        }
        max2=(top-special[special.length-1]);

    return Math.max(count, Math.max(max, max2));

}}