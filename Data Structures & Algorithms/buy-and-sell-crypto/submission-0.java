class Solution {
    public int maxProfit(int[] prices) {
        //int[] sortedArray = Arrays.sort(prices);
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0 ; i < prices.length ; i++){
            int currentPrice = prices[i];
            if (currentPrice < minPrice) minPrice = currentPrice;
            int newProfit = currentPrice - minPrice;
            if(newProfit > maxProfit){
                maxProfit = newProfit;
            };
        } 
    return maxProfit;
}
}
