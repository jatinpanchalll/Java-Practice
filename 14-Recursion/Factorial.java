public class Factorial {

    public static int fact(int n){

        if(n == 0){
            return 1;
        }

        int fact1 = fact(n-1);   // Recursive Call, SC/TC O(N)
        int fact = n * fact1;

        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));

    }
}