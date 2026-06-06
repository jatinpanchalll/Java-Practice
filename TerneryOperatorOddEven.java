 // TERNARY OPERATOR
 // ODD EVEN
 import java.util.*;
 public class TerneryOperatorOddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();


        String type=(Number%2==0)?"EVEN":"ODD";
        System.out.println(type);
    }
    }
