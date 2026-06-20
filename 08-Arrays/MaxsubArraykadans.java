public class MaxsubArraykadans {
    public static void Kadens(int Numbers[]){
      int currsum = 0;
      int maxsum = Integer.MIN_VALUE;

      for(int i=0; i<Numbers.length; i++){
        currsum = currsum + Numbers[i];

        if(currsum < 0){
            currsum = 0;
        }

        maxsum = Math.max(maxsum, currsum);
      }
      System.out.println("Max Sum Is : " + maxsum);
    }

    public static void main(String[] args) {
        int Numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadens(Numbers);
    }
}
