class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] res = new String[score.length];
        int j = 0;
        for (int i : score) {
            map.put(i, j);
            j++;
        }
        Arrays.sort(score);
        int k = 1;
        for (int i = score.length - 1; i >= 0; i--) {
            if (k == 1) {
                int key = map.get(score[i]);
                res[key] = "Gold Medal";
            } else if (k == 2) {
                int key = map.get(score[i]);
                res[key] = "Silver Medal";
            } else if (k == 3) {
                int key = map.get(score[i]);
                res[key] = "Bronze Medal";
            }
            else{
               res[map.get(score[i])]=Integer.toString(k);
            }
            k++;
        }
        return res;
    }
}