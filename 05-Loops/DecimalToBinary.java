 // DECIMAL TO BINARY
 import java.util.Scanner;
 public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter The Dec :");
        int Number = sc.nextInt();


        String binaryString="";


        while (Number > 0) {
            int remainder = Number % 2;
            binaryString = remainder + binaryString;
            Number = Number / 2;
        }        
         System.out.println("Binary Is: " + binaryString);
        }
    }
