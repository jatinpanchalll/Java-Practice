
import java.util.Scanner;

public class DecimalToBinary {

    public static void DecimalToBinary(int n){

        if (n == 0) {
            System.out.println("Binary Form: 0");
            return;
        }


       int pow = 0;
       int Binary = 0;

       while (n > 0) {
        int rem = n % 2;
        Binary = Binary + (rem * (int)Math.pow(10, pow));
        pow++;
        n = n/2;
        
       }
       System.out.println("Binary Form " + Binary);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DecimalToBinary(n);

        }
    }


    
