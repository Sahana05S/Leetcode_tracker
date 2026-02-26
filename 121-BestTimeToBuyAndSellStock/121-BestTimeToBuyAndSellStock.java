// Last updated: 2/26/2026, 9:57:03 AM
class Solution {
    public int maxProfit(int[] price) {
        int minprice=price[0];
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(price[i]<minprice) minprice=price[i];
            int profit =price[i]-minprice;
            if(profit>maxprofit) maxprofit=profit;
        }
        return maxprofit;
    }
}