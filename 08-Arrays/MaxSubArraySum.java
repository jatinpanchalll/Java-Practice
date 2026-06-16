public class MaxSubArraySum {

    public static void MaxSubArraySum(int Numbers[]){
        
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<Numbers.length; i++){
         int Start = i;

          for(int j=i; j<Numbers.length; j++){
            int end = j;
            currsum = 0;

             for(int k=Start; k<=end; k++){
               currsum += Numbers[k];
            }
        System.out.println(currsum);
        if(maxsum < currsum){
            maxsum = currsum;
        }
      }
     }
      System.out.println("Max Sum Is : " + maxsum);
    }

    public static void main(String[] args) {
        int Numbers[] = {2,4,6,8,10};
        MaxSubArraySum(Numbers);
    }
}

