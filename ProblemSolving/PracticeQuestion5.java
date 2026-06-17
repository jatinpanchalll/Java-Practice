package ProblemSolving;

 // Reverse An Array
public class PracticeQuestion5 {
    
    public static void ReverseAnArray(int Array[]){
        for(int i=Array.length-1; i>=0; i--){
            System.out.print(Array[i] + " ");
        }
    }

    public static void ReverseAnArray2(int Array[]){
        int Start = 0, end = Array.length-1;
        int temp = 0;

        while (Start <= end) {
            temp = Array[Start];
            Array[Start] = Array[end];
            Array[end] = temp;
        
        Start ++;
        end --;
        }

    }
    public static void main(String[] args) {
         int Array[] = {1,2,3,4,5,6,7,8,9};
         ReverseAnArray2(Array);
         for(int i=0; i<Array.length; i++){
            System.out.print(Array[i]);
            System.out.print(" ");
        }

    }
}
