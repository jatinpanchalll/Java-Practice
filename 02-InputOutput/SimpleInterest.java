 //CALCULATE SIMPLE INTEREST BY INPUT
 import java.util.*;


 public class SimpleInterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter The Value Of P :");
        float P = sc.nextFloat();


        System.out.print("Enter The Value Of R :");
        float R = sc.nextFloat();


        System.out.print("Enter The Value Of T :");
        float T = sc.nextFloat();


        float SI = P*R*T/100;


        System.out.print("SI : ");
        System.out.println(SI);
    }
 }
