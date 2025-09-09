class Solution {
    public int maxProfit(int[] prices) {
        int BuyPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            BuyPrice=Math.min(BuyPrice,prices[i]);
           if(prices[i]>BuyPrice){
                maxProfit=Math.max(maxProfit,prices[i]-BuyPrice);
           }
            
        }
        return maxProfit;
    }
}