
import java.util.Scanner;

public class BinaryToDecimal {

    public static void BinToDecimal(int Binary){
       int pow = 0;
       int Decimal = 0;

       while(Binary < 0){
        int lastdigit = Binary % 10 ;
        Decimal = Decimal * (lastdigit * (int)Math.pow(2, pow));

        pow++;
        Binary = Binary / 10;
       }
       System.out.println("decimal of" + Binary + " = " + Decimal);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BinToDecimal(n);

        }
    }


    


