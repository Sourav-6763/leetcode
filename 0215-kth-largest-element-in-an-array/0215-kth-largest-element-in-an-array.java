class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ab=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
             ab.offer(nums[i]);
            if(ab.size()>k){
                ab.poll();
            }
           
        }
       return  ab.peek();
    }
}