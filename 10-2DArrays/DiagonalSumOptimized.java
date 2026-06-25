public class DiagonalSumOptimized {

    public static int DiagonalSum(int Matrix[][]){

        int Sum = 0;
        for(int i=0; i<Matrix.length; i++){
            Sum += Matrix[i][i];
        if(i != Matrix.length-1-i){
            Sum += Matrix[i][Matrix.length-i-1];
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
