class Solution {
    public String[] findRelativeRanks(int[] score) {   
         List<List<Integer>> ab = new ArrayList<>();
         int idx=0;
        for(int i:score){
            ab.add(Arrays.asList(i,idx++));
        }
        
        ab.sort((a, b) -> b.get(0) - a.get(0));
        String [] abc=new String[score.length];
        int count=4;
        for(int i=0;i<score.length;i++){
            int ap=ab.get(i).get(1);
            if(i==0){
            abc[ap]="Gold Medal";
            }
            else if(i==1){
            abc[ap]="Silver Medal";
            }
            else if(i==2){
            abc[ap]="Bronze Medal";
            }
            else{
                abc[ap]=String.valueOf(count);
                count++;
            }

        }
        return abc;

    }
}