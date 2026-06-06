import java.util.*;

public class SumOfOddEvenIntegers {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int EvenSum = 0;
    int OddSum = 0;

    int i = 0;
    
    while( i <= n){
        if( i % 2 == 0){
            EvenSum = EvenSum + i;
        }
        else{
            OddSum = OddSum + i;
            
        }
        i++;
    }
        System.out.println("Even Sum = " + EvenSum);
        System.out.println("Odd Sum = " + OddSum);
    
}
}