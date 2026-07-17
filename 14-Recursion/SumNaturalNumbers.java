public class SumNaturalNumbers {

    public static int SumOfNatural(int n){

        if(n == 1){
            return 1;
        }

        int Sum = SumOfNatural(n - 1);
        int Sum2 = n + Sum;

        return Sum2;
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(SumOfNatural(n));

    }
}