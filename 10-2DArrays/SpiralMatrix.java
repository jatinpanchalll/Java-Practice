public class SpiralMatrix {

    public static void SpiralMatrix(int Matrix[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = Matrix.length-1;
        int EndCol = Matrix[0].length-1;

        while (StartRow <= EndRow && StartCol <= EndCol) {
            
        //TOP
        for(int j=StartCol; j<=EndCol; j++){
            System.out.print(Matrix[StartRow][j]+" ");
        }
        
        //RIGHT
        for(int i=StartRow+1; i<=EndRow; i++){
            System.out.print(Matrix[i][EndCol]+" ");
        }

        //BOTTOM
        // if(StartRow != EndRow)
        for(int j=EndCol-1; j>=StartCol; j--){
            System.out.print(Matrix[EndRow][j]+" ");
        }

        //LEFT
        // if(StartCol != EndCol)
        for(int i=EndRow-1; i>=StartRow+1; i--){
            System.out.print(Matrix[i][StartCol]+" ");
        }

        StartRow++;
        EndRow--;
        StartCol++;
        EndCol--;

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
