class Solution {
    public int maxProfit(int[] price) {
        int minPrice=price[0];
        int profit=0;
        for(int i=0;i<price.length;i++){
            minPrice=Math.min(minPrice,price[i]);
            profit=Math.max(profit,price[i]-minPrice);
        }
        return profit;
    }
}