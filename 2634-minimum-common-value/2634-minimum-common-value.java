class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       HashSet<Integer> setA=new HashSet<>();
        HashSet<Integer>setB=new HashSet<>();
        for(int a:nums1){
            setA.add(a);
        }
        for(int b:nums2){
            setB.add(b);
        }
        HashSet<Integer> intersection=new HashSet<>(setA);
        intersection.retainAll(setB);
        int MinResult=Integer.MAX_VALUE;
        for(int minel:intersection){
            if(MinResult>minel){
                MinResult=minel;
            }
        }
        return MinResult==Integer.MAX_VALUE?-1:MinResult;
    }
}