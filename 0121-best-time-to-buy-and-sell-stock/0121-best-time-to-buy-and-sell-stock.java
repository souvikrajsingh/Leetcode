class Solution {
    public int maxProfit(int[] prices) {
       int min = prices[0];
        int dif, profit = 0;
        for (int i = 1; i < prices.length; i++) {
            dif = prices[i] - min;
            profit = Math.max(profit , dif);
            min = Math.min(min , prices[i]);

        }
        return profit;
    }
}