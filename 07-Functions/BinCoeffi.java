public class BinCoeffi {
    
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
         fact = fact * i;
    }
      return fact;
}

   public static int BinCoeff(int n, int r){
    int n_fact = factorial(n);
    int r_fact = factorial(r);
    int nmr_fact = factorial(n-r);

    int BinCoff = n_fact / (r_fact * nmr_fact);
    return BinCoff;
   }

   public static void main(String[] args) {
    System.out.println(BinCoeff(10, 4));
   }
}