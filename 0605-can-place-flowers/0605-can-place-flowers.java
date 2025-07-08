class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        List<Integer> ab =new ArrayList<>();
        ab.add(0);
for (int i=0;i<flowerbed.length;i++) {

    ab.add(flowerbed[i]);
    
}
ab.add(0);
       for(int i=1;i<ab.size()-1;i++){
        if(ab.get(i)==0){
            if(ab.get(i-1)==0 && ab.get(i+1)==0){
                ab.set(i,1);
                n--;
                if(n==0){
                    break;
                }
            }
         }
       }
    System.out.println(ab);
       return n==0? true:false;
    }
}