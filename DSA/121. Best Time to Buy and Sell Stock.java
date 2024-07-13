class Solution {
    public int maxProfit(int[] prices) {
        //time limit exceeded for few test cases
        /*int max;
        int[] profit = new int[prices.length];
        for(int i = 0; i < prices.length-1; i++){
            max = Integer.MIN_VALUE;
            for(int j = i+1; j < prices.length; j++){
                max = Math.max(max, prices[j]);
            }
            if(max > prices[i]){
                profit[i] = max - prices[i];
            }
        }
        Arrays.sort(profit);
        return profit[profit.length-1];*/
        if(prices == null || prices.length == 0){ 
            return 0;
        }
        return getMaxProfit(prices);
    }
     private int getMaxProfit(int[] prices) {
        int minStockPrice = Integer.MAX_VALUE;
        int maxDiff = 0;
        for(int i = 0; i < prices.length; i++) {
            int earn =  prices[i] - minStockPrice;
            maxDiff = Math.max(earn, maxDiff);
            minStockPrice = Math.min(minStockPrice, prices[i]);
        }
        return maxDiff;
    }
}
