public class PracticeQuestion19 {

    public static int buysell(int Prices[]){
        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;

        for(int i=0; i<Prices.length; i++){

            if(Prices[i] > buyprice){
            int profit = Prices[i] - buyprice;
            maxprofit= Math.max(maxprofit, profit);
            }

            else{
                buyprice = Prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int Prices[] = {7,1,5,3,6,4};
        System.out.println(buysell(Prices));
    }
}
