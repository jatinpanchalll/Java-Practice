import java.util.Arrays;

public class CountingSort {
    
    public static void CountingSort(int arr[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            Largest = Math.max(Largest, arr[i]);
        }

        int Count[] = new int[Largest+1];
        for(int i=0; i<arr.length; i++){
            Count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<Count.length; i++){
            while (Count[i]>0) {
                arr[j] = i;
                j++;
                Count[i]--;
                
            }
        }
    }

        public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
}


    }

