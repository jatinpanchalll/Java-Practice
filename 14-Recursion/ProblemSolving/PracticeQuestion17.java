public class PracticeQuestion17{
    public static void Reversearray(int arr[]){
        int first = 0;
        int Last = arr.length-1;

        while (first < Last) {
            int temp = arr[first];
            arr[first] = arr[Last];
            arr[Last] = temp;

            first++;
            Last--;
        }
    }


    public static void main(String[] args) {
    int arr[] = {2,4,6,8,10,12,14};

    Reversearray(arr);
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
}
}