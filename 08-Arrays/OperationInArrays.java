import java.util.*;

public class OperationInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //CREATION
        int Marks[] = new int[50];

        //INPUT
        Marks[0] = sc.nextInt();
        Marks[1] = sc.nextInt();
        Marks[2] = sc.nextInt();

        //OUTPUT
        System.out.println("Physics : " + Marks[0]);
        System.out.println("Chem : " + Marks[1]);
        System.out.println("Maths : " + Marks[2]);

        int Percentage = (Marks[0] + Marks[1] + Marks[2]) / 3;
        System.out.println(Percentage + "%");

        //UPDATE
        Marks[0] = Marks[0] + 1;
        System.out.println("Updated Physics : " + Marks[0]);



    }
}
