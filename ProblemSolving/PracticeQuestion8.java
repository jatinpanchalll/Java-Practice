public class PracticeQuestion8 {
    public static void PrefixSumOfSubArray(int Numbers[]){
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE;
       int Prefix[] = new int[Numbers.length];
       
       Prefix[0] = Numbers[0];
       for(int i=1; i<Numbers.length; i++){
        Prefix[i] = Prefix[i-1] + Numbers[i];
       }

       for(int i=0; i<Numbers.length; i++){
        int Start = i;
 
        for(int j=i; j<Numbers.length; j++){
            int End = j;

            currsum = Start == 0 ? Prefix[End] : Prefix[End] - Prefix[Start-1];
            
            if(currsum > maxsum){
            maxsum = currsum;}

        }
       }
       System.out.println("Max Sum Is : " + maxsum);
    }

    public static void main(String[] args) {
       int Numbers[] = {2,4,6,8,10};
       PrefixSumOfSubArray(Numbers);
    }
}