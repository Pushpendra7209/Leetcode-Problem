public class Best_time_to_buy_and_sell_stock_ll {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int i;
        for(i = 0; i<prices.length-1; i++)
        {
            if(buy < prices[i]){
                profit =profit + prices[i] - buy;
                buy = prices[i];
            }
            if(prices[i] < prices[i+1]){
                buy = prices[i];
            }
        }
        if(prices[i]> buy){
            profit =profit + prices[i] - buy;
        }
        return profit;
    }
}
