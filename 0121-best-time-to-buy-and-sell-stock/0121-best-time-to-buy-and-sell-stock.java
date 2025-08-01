class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minnum=prices[0];
        for(int i=1;i<prices.length;i++){
            minnum=Math.min(minnum,prices[i]);
            if(prices[i]>minnum){
                maxprofit=Math.max(maxprofit,prices[i]-minnum);
            }
        }
        return maxprofit;
    }
}