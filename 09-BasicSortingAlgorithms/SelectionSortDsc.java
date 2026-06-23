public class SelectionSortDsc {

    public static void SelectionSortDsc(int arr[]){
      for(int i=0; i<arr.length-1; i++){
        int MinPos = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[MinPos] < arr[j]){
                MinPos = j;
            }
        }

        int temp = arr[MinPos];
        arr[MinPos] = arr[i];
        arr[i] = temp;
      }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        SelectionSortDsc(arr);
        print(arr);
    }
}

