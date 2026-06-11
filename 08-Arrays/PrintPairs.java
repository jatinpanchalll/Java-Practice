public class PrintPairs {
    public static void Pairs(int Numbers[]){

        int tp= 0;

        for(int i=0; i<Numbers.length-1; i++){
         int curr = Numbers[i];
         for(int j=i+1; j<Numbers.length; j++){
            System.out.print("(" + curr + "," + Numbers[j] + ") ");
            tp++;
         }
         System.out.println();
        }         
        System.out.println("Total Pairs: " + tp);
    }

    public static void main(String[] args) {
        int Numbers[] = {2,4,6,8,10};
        Pairs(Numbers);
    }
}
