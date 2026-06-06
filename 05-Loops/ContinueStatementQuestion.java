import java.util.*;
public class ContinueStatementQuestion {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter The Number : ");
            int n = sc.nextInt();
            if( n % 10 == 0){
                continue;
            }
            System.out.println("number Was "+n);
        }while(true);
        
    }
}
