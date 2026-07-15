public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {

        boolean firstRow = false;
        boolean firstCol = false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++)
            if (matrix[0][j] == 0)
                firstRow = true;

        for (int i = 0; i < rows; i++)
            if (matrix[i][0] == 0)
                firstCol = true;

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if (firstRow) {
            for (int j = 0; j < cols; j++)
                matrix[0][j] = 0;
        }

        if (firstCol) {
            for (int i = 0; i < rows; i++)
                matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}