class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = 0;
        // Find greatest possible difference between values
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - prices[min] > profit){
                profit = prices[i] - prices[min];
            }
            else if(prices[i] < prices[min]){
                min = i;
            }
        }
        return profit;
    }
}