public class ParcticeQuestion14 {

    public static void printPairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+ arr[i] + ","+ arr[j] + ")");
            }
            System.out.println();
        }
    }

public static void Subarray(int arr[]){
    int currsum;
    int maxsum = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
        int Start = i;
        for(int j=i; j<arr.length; j++){
            int End = j;
            currsum = 0;
            for(int k=Start; k<=End; k++){
                currsum += arr[k];
                
            }
            maxsum = Math.max(currsum, maxsum);
            System.out.println(currsum);
        }
    }System.out.println(maxsum);
}
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Subarray(arr);
    }
}
