import java.util.*;

public class InvertedStarPattern {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       for(int Line=1; Line<=n; Line++){
        for(int Star=1; Star<=n-Line+1; Star++){
          System.out.print("*");
        }
        System.out.println();
       }
    }
}
