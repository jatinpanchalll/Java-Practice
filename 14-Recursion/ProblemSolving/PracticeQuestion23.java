import java.util.*;
public class PracticeQuestion23 {

    public static int Search(int arr[][], int key){
       for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            if (arr[i][j] == key) {
                System.out.println("index is: "+i+","+j);

            }
        }
       }return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        
        int n = 3, m = 3;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<m; j++){
            System.out.print(arr[i][j] + " ");
            
        }
        System.out.println();
    }

    int key = 8;

    System.out.println(Search(arr, key));
}
}