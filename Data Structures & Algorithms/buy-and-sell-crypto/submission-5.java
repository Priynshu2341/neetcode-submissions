class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buydate = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buydate){
                buydate = prices[i];
            }

            int profit = prices[i] - buydate;

            maxProfit = Math.max(profit,maxProfit);
        }

        return maxProfit;
    }
}
