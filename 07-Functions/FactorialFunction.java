import java.util.*;

public class FactorialFunction {
    
    public static int Factorial(int Num){

        int fact = 1;
       for(int i=1; i<=Num; i++){
        fact = fact * i;
       }
       return fact;
    }

    public static void main(String[] args) {
        int Num = 5;
        System.out.println(Factorial(Num));
    }
}
