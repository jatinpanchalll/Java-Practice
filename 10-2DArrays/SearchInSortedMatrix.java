import java.security.Key;

public class SearchInSortedMatrix {

    public static boolean StaircaseSearch(int Matrix[][], int Key){
        int Row = 0, Col=Matrix[0].length-1;
        while(Row < Matrix.length && Col >= 0){
            if(Matrix[Row][Col] == Key){
              System.out.println("Key Found At Index : (" + Row + "," + Col + ")");
              return true;
            }

            else if(Key < Matrix[Row][Col]){
                Col--;
            }

            else{
                Row++;
            }
        }
        System.out.println("Key Is Not Found");
        return false;
    }
    public static void main(String args[]){
        int Matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        int Key = 13;

        StaircaseSearch(Matrix, Key);
    }
}
