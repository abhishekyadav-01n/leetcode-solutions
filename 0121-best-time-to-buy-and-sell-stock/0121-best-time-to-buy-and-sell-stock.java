class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int val : prices){
            if(val < buyPrice){
                buyPrice = val;
            }
            else{
                maxProfit = Math.max(maxProfit , val - buyPrice);
            }
        }
        return maxProfit;
    }
}