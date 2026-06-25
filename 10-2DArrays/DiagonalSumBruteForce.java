public class DiagonalSumBruteForce{
    
    public static int DiagonalSum(int Matrix[][]){

        int Sum = 0;
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix.length; j++){

                if(i==j){
                    Sum += Matrix[i][j];
                }
                else if( i+j == Matrix.length-1){
                    Sum += Matrix[i][j];
                }
            }
        }

        return Sum;
    }


    public static void main(String[] args) {
        int Matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        System.out.println(DiagonalSum(Matrix));
    }
}
