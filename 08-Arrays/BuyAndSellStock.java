public class BuyAndSellStock {
    public static int BuyAndSell(int Prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0; i<Prices.length; i++){
            if(BuyPrice < Prices[i]){
                int Profit = Prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, Profit);
            }

            else{
                BuyPrice = Prices[i];
            }
        }
        return MaxProfit;
    } 

    public static void main(String[] args) {
        int Prices[] = {7,1,5,3,6,4};
        System.out.println(BuyAndSell(Prices));
    }
}
