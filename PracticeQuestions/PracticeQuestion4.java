package PracticeQuestions;

public class PracticeQuestion4 {
    public static int BinarySearch(int array[], int key){
      int Start = 0, End = array.length-1;

      for(int i=0; i<array.length; i++){
        
        int mid = Start + End / 2;

        if(array[mid] == key){
                return mid;
            }
            if (array[mid]  < key) {
                Start = mid+1;
            }
            else{
                End = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,6,8,10,12};
        int key = 12;
        System.out.println(BinarySearch(array, key));
    }
}
