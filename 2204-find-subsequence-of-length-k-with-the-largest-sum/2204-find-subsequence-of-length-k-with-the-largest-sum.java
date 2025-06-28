class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<List<Integer>> ab = new ArrayList<>();
        int index = 0;
        for (int i : nums) {
            ab.add(Arrays.asList(i, index++));

        }
        int row = ab.size();
        int cols = ab.get(0).size();
        ab.sort((a, b) -> b.get(0) - a.get(0));

        List<List<Integer>> ab2 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                cur.add(ab.get(i).get(j)); 
            }
            ab2.add(cur); 
        }
         System.out.println(ab2);
        ab2.sort((a,b)->a.get(1)-b.get(1));
        int [] result=new int[k];
        int fRow=ab2.size();
        System.out.println(ab2);


        for(int i=0;i<fRow;i++){
            result[i]=ab2.get(i).get(0);
        }
        for(int i:result){
            // System.out.println(i);
        }
        return result;
    }
}