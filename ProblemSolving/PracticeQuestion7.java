public class PracticeQuestion7 {
    public static void SubarraySum(int Array[]){
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE;

       for(int i=0; i<Array.length; i++){
        int Start = i;

        for(int j=i; j<Array.length; j++){
            int End = j;
            currsum = 0;

            for(int k=Start; k<=End; k++){
                currsum += Array[k];
            }

            System.out.println(currsum);
            if(maxsum < currsum){
                maxsum = currsum;
            }
            
         }
       }
                   System.out.println("max is " + maxsum);

    }
    
    public static void main(String[] args) {
        int Array[] = {1,2,3,4,5};
        SubarraySum(Array);
    }
}
