import java.util.*;

public class MaxSubArray2 {

    public static void maxsubarraysum(int Numbers[]){
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE;
       int prefix[] = new int[Numbers.length]; 
    
       prefix[0] = Numbers[0];
       for(int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + Numbers[i];
       }

        for(int i=0; i<Numbers.length; i++){
         int Start = i;

          for(int j=i; j<Numbers.length; j++){
            int end = j;
            
            currsum = Start == 0 ? prefix[end] : prefix[end] - prefix[Start-1];

            if (currsum > maxsum) {
                maxsum = currsum;
            }
    }
    }  
    System.out.println("Max Sum Is : " + maxsum);
}

    public static void main(String[] args) {
        int Numbers[] = {2,4,6,8,10};
        maxsubarraysum(Numbers);
}
    }