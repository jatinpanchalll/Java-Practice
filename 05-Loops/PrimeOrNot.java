import java.util.*;
public class PrimeOrNot {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the Number : ");
      int n = sc.nextInt();

      boolean IsPrime = true;

      for(int i=2; i< n-1; i++){
        if(n % i==0){
            IsPrime = false;
        }
     }

    if(IsPrime == true){
          System.out.println("Number Is Prime");
        }
    else{
            System.out.println("It is Not an prime number");
        }
    }
}
