public class PracticeQuestion16 {

    public static void Kadans(int arr[]){
        int currsum = 0;;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currsum += arr[i];

            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Kadans(arr);
    }
}
