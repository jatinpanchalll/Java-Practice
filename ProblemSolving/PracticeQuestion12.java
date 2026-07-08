public class PracticeQuestion12 {

    public static int BinerySearch(int arr[], int key){
        int Start=0, End=arr.length-1;
       while(Start <= End){
        int mid = (Start + End) / 2;

        if(arr[mid]==key){
            return mid;
        }

        else if(arr[mid] < key){
           Start = mid + 1;
        }

        else{
            End = mid - 1;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
       int arr[] = {2,4,6,8,10,12};
       int key = 8;

       int index = BinerySearch(arr, key);
       System.out.println(index);

        
    }
}
