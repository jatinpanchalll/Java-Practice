package PracticeQuestions;

// LINEAR SEARCH
public class PracticeQuestion2 {

    public static int LinearSearch(int array[], int key){
        for(int i=0; i<array.length; i++){
          if(array[i] == key){
            return i;
          }
        }
          return -1;
    }
    public static void main(String[] args) {
        int array[] = {1,5,2,6,4,8,9};
        int key = 9;

        System.out.println(LinearSearch(array, key));
        
    }
}
