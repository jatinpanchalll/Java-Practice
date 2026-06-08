import java.util.*;
public class CharectorPattern {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       char ch = 'A';

       for(int Line=1; Line<=n; Line++){
        for(int j=1; j<=Line; j++){
          System.out.print(ch);
          ch++;
        }
        System.out.println();
       }
    }
}
