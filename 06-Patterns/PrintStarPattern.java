import java.util.*;

public class PrintStarPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int Lines = 1; Lines <= n; Lines++ ){
            for(int Star=1; Star<=Lines; Star++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
