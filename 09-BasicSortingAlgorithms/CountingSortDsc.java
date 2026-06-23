public class CountingSortDsc {

    public static void CountingSortDsc(int arr[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            Largest = Math.max(Largest, arr[i]);
        }

        int Count[] = new int[Largest+1];
        for(int i=0; i<arr.length; i++){
            Count[arr[i]]++;
        }

        int j=0;
        for(int i=Count.length-1; i>=0; i--){
    while(Count[i] > 0){
        arr[j] = i;
        j++;
        Count[i]--;
    }
                
            }
        }
    

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        CountingSortDsc(arr);
        print(arr);
    }
}
