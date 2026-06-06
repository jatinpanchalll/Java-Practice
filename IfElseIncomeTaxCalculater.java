import java.util.Scanner;

public class IfElseIncomeTaxCalculater {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int Tax;


        if(Income < 500000){
            Tax = 0;
        }
        else if(Income >= 500000 && Income < 1000000){
            Tax = (int)(Income*0.2);
         }


        else{
            Tax = (int)(Income*0.3);
        }


         System.out.println("YOUR TAX IS:" + Tax);
        }

}
