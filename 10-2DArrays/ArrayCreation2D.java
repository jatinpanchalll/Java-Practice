import java.util.Scanner;

public class ArrayCreation2D {

    public static void main(String[] args) {
        int Matrix[][] = new int[3][3];

        int n = 3;
        int m = 3;

        System.out.print("Enter Elements : ");

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                Matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
          System.out.print(Matrix[i][j] + " ");        
    }
    System.out.println();
}
    }
}