import java.util.*;
public class FactorialOfN {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter The Number");
    int n = sc.nextInt();

    int factorial = 1;

    for ( int i=1; i<=n; i++){
        factorial = factorial*i;
        
    }
    System.out.println("factorial is " + factorial);

    }
}
