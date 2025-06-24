import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> ab = new HashMap<Integer, Integer>();
    
        
        for (int a : nums) {
            if (!ab.containsKey(a)) {
                int count = 1;
                ab.put(a, count);

            } else if (ab.containsKey(a)) {
                int c = ab.get(a);
                ab.put(a, c + 1);
            }
        }
        ArrayList<Integer> keys = new ArrayList<Integer>(ab.keySet());
        Collections.sort(keys); 
        // for (int r : keys) {
        //     if (ab.get(r) >= 2) {
        //         result.add(r);
        //         result.add(r);
        //     }
        //     else{
        //         result.add(r);
        //     }
        // }
        int i=0;
        for(int r:keys){
            
            if (ab.get(r) >= 2) {
                
                nums[i]=r;
                i++;
                nums[i]=r;
                i++;
            }
            else{
                nums[i]=r;
                i++;
            }
        }
      
        return i;

    }
}