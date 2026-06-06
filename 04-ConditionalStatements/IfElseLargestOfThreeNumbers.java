import java.util.Scanner;

public class IfElseLargestOfThreeNumbers {
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        if(A>=B && A>=C){
            System.out.println("A IS LARGEST");
        }
        else if(B>=C){
            System.out.println("B IS LARGEST");
        }
        else {
            System.out.println("C IS LARGEST");
        }
    }

}
