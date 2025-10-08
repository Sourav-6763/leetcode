class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        int maxProfit=0;
        for(int i:prices){
            buy=Math.min(i,buy);
            profit=i-buy;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}