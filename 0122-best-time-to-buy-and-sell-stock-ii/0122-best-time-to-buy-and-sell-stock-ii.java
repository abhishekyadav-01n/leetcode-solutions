class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = prices[0];
        int totProfit = 0;
        for(int i = 1; i<n ; i++){
            if(prices[i] > prices[i-1]){
                totProfit += (prices[i] - prices[i-1]); 
            }
        }
        return totProfit;
    }
}