public class SelectionSort {
    public static void SelectionSort(int arr[]){

        for(int i=0; i<arr.length; i++){
            int MinPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[MinPos] > arr[j]){
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

    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        SelectionSort(arr);
        print(arr);

    }
}