 // REVERSE OF A NUMBER
 import java.util.Scanner;
 public class ReverseOfANumber2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to reverse: ");
        int number = sc.nextInt();
        int reversedNumber = 0;
       
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
       
        System.out.println("The reversed number is: " + reversedNumber);
        sc.close();
    }
 }
