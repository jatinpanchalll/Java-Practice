import java.util.*;
public class TableOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int N = sc.nextInt();

        int Table = 1;

        for(int i=1; i<=10; i++){
           Table = i*N;
           System.out.println(N + "*" + i +"=" + Table);
        }

    }
}
