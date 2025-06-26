class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> peak=new ArrayList<>();
       
        
        for(int i=1;i<=mountain.length-2;i++){
            if(mountain[i-1]<mountain[i] && mountain[i+1]<mountain[i]){
                peak.add(i);
            

            }
        }
        return peak;
    }
}