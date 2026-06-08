    import java.util.*;
    public class HalfPyramid {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       for(int Line=1; Line<=n; Line++){
        for(int j=1; j<=Line; j++){
          System.out.print(j);
        }
        System.out.println();
       }
    }
}
