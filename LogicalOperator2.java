 //LOGICAL AND
 import java.util.*;
 public class LogicalOperator2{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);


   boolean X,Y;


   System.out.println("Enter A:");
   int A = sc.nextInt();  
   System.out.println("Enter B:");
   int B = sc.nextInt();
   X=A>B;


   System.out.println("Enter C:");
   int C = sc.nextInt();
   System.out.println("Enter D:");
   int D = sc.nextInt();
   Y=C>D;
   
 System.out.println((X && Y));
   
 }
 }
