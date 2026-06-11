public class BinarySearch {
    public static int BinarySearch(int Array[], int key){
        int Start=0, End=Array.length-1;


        while(Start<=End){
            
            int mid = (Start + End)/2;

            if(Array[mid] == key){
                return mid;
            }
            if (Array[mid]  < key) {
                Start = mid+1;
            }
            else{
                End = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int Array[] = {1,2,3,4,5,6,7,8,9};
        int key = 9;

        int Index = BinarySearch(Array, key);
        System.out.println(Index);
    }
}
