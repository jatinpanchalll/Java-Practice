package PracticeQuestions;

// LARGEST OF AN ARRAY
public class PracticeQuestion3 {
    public static void LargestInarray(int array[]){
        int Largest = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] > Largest){
                Largest = array[i];
            }
        }
        System.out.println(Largest);
    }
    public static void main(String[] args) {
        int array[] = {1,5,2,6,4,8,9,158};
        LargestInarray(array);
    }
    
}
