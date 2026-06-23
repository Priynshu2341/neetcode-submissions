class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyDay = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(buyDay > prices[i] ){
                buyDay = prices[i];
            }

            int profit = prices[i] - buyDay;
            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}
