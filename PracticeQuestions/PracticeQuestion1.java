package PracticeQuestions;
import java.util.*;

// Array Creation, Insert, Update 
public class PracticeQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = {1,2,3,5,4,7,9,9};

        int array1[]= new int[5];


        for(int i=0; i<array1.length; i++){
            array1[i] = sc.nextInt();
        }
        
 
        for(int i=0; i<array1.length; i++){
             System.out.print(array1[i]+ " ");
         }
        System.out.println("\ntotal Elements:" + array1.length);
    }
}
