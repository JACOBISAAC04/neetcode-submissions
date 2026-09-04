class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxpro=0;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }
            else{
                maxpro=Math.max(maxpro,price-minprice);
            }
        }
        return maxpro;
    }
}
