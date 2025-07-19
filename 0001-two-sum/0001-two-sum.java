class Solution {
    public int[] twoSum(int[] nums, int sum) {
        int n=nums.length;
          int[][] arr = new int[n][2];

        // Store value and original index
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int left=0;
        int right=arr.length-1;
        int [] res=new int[2];
        while(left<right){
            int val=arr[left][0]+arr[right][0];
            if(sum==val){
                res[0]=arr[left][1];
                res[1]=arr[right][1];
            }
            if(sum<val){
                right--;
            }
            else{
                left++;
            }
        }
        return res;
    }
}