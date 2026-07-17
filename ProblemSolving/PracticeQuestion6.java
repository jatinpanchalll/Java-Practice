package ProblemSolving;

// PRINT SUBARRAYS
public class PracticeQuestion6 {
    public static void PrintSubArray(int Numbers[]){
        for(int i=0; i<Numbers.length; i++){
         int Start = i;

          for(int j=i; j<Numbers.length; j++){
            int end = j;

             for(int k=Start; k<=end; k++){
                System.out.print(Numbers[k] + " ");
            }
        System.out.println();
          }
        System.out.println();

        }
    }

    public static void main(String[] args) {
        int Numbers[] = {2,4,6,8,10};
        PrintSubArray(Numbers);
    }
}

