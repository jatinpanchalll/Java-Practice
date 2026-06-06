 // BINARY TO DECIMAL
 import java.util.Scanner;
 public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();   
        int decimal = 0, base = 1, rem;


        while (binary > 0) {
            rem = binary % 10;          
            decimal = decimal + rem * base; 
            base = base * 2;            
            binary = binary / 10;       
        }


        System.out.println("Decimal = " + decimal);
    }
 }
