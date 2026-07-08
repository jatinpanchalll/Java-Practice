public class PracticeQuestion18 {

    public static void prefixsum(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
          prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int Start = i;
            for(int j=i; j<arr.length; j++){
                int End = j;

                currsum = Start == 0? prefix[End]: prefix[End] - prefix[Start];

                maxsum = Math.max(currsum, maxsum);
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        prefixsum(arr);
    }
}
