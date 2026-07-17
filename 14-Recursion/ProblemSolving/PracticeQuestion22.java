public class PracticeQuestion22{

public static void SpiralMatrix(int Matrix[][]){
    int StartRow = 0;
    int StartCol = 0;
    int EndRow = Matrix.length-1;
    int EndCol = Matrix[0].length-1;

    while (StartRow <= EndRow && StartCol <= EndCol) {
        
        //TOP
        for(int i=StartCol; i<=EndCol; i++){
            System.out.print(Matrix[StartRow][i] + "");
        }

        //RIGHT
        for(int j=StartRow+1; j<=EndRow; j++){
            System.out.print(Matrix[j][EndCol]);
        }

        //BOTTOM
        for(int i=EndCol-1; i>=StartCol; i--){
            System.out.print(Matrix[EndRow][i]);
        }

        //LEFT
        for(int j=EndRow-1; j>=StartRow+1; j--){
            System.out.print(Matrix[j][StartCol]);
        }

        StartRow++;
        EndCol--;
        StartCol++;
        EndRow--;
    }

}
    public static void main(String[] args) {
        int Matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

                          SpiralMatrix(Matrix);
    }
}