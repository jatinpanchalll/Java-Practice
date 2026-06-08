import java.util.*;
public class ArithmeticOperators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int Sum, Substruct, Multi, Devide, Modulas;

        Sum = A+B;
        Substruct = A-B;
        Multi = A*B;
        Devide = A/B;
        Modulas = A%B;

        System.out.println("Sum Is:"+ Sum);
        System.out.println("Substruct Is:"+ Substruct);
        System.out.println("Multi Is:"+ Multi);
        System.out.println("Devide Is:"+ Devide);
        System.out.println("Modulas Is:"+ Modulas);

    }
}
