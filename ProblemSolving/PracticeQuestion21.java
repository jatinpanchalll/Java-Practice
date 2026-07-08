public class PracticeQuestion21 {

    public static void spiralmatrix(int matrix[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length-1;
        int EndCol = matrix[0].length-1;

        while (StartRow <= EndRow && StartCol <= EndCol) {
        //TOP
        for(int i=StartCol; i<=EndCol; i++){
           System.out.print(matrix[StartRow][i]);
        }

        //RIGHT
        for(int j=StartRow+1; j<=EndRow; j++){
           System.out.print(matrix[j][EndCol]);
        }

        //BOTTOM
        //if(StartRow != EndRow)
        for(int i=EndCol-1; i>=StartCol; i--){
           System.out.print(matrix[EndRow][i]);
        }
        
        //LEFT
        if(StartCol != EndCol)
        for(int j=EndRow-1; j>=StartRow+1; j--){
           System.out.print(matrix[j][StartCol]);
        }

        StartRow++;
        StartCol++;
        EndCol--;
        EndRow--;
    }
}
    public static void main(String[] args) {

        int Matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        spiralmatrix(Matrix);
}
}