import java.util.Scanner;

public class SearchElement {

    public static void SearchElement(int Matrix[][], int key){
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[0].length; j++){
                if(Matrix[i][j] == key){
                    System.out.println("index is: "+i+","+j);
                }
            }
        }
    }
    
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
    SearchElement(Matrix, 7);
    }
}

