import java.util.*;

public class SyntaxWithParameter {
    
    public static int calculateSum(int Num1, int Num2){
        int Sum = Num1 + Num2;
        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int Sum = calculateSum(a, b);
        System.out.println(Sum);
    }
}
