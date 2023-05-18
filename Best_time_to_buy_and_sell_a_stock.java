public class Best_time_to_buy_and_sell_a_stock {
    public int maxProfit(int[] prices) {
        int cp = Integer.MAX_VALUE;
        int sp =0;
        int profit =0;
        int profitNow =0;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < cp ){
                cp = prices[i];
            }
            profitNow = prices[i] - cp;
            if(profitNow > profit){
                profit = profitNow;
            }
        }
        return profit;
    }
}
