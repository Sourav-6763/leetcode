class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(Arrays.asList(1));

        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=result.get(i-1);
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                int sum=prevRow.get(j-1)+prevRow.get(j);
                temp.add(sum);
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}