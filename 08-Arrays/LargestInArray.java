public class LargestInArray {
    public static int Largest(int Numbers[]){
      int Largest = Integer.MIN_VALUE;

      for(int i=0; i<Numbers.length; i++){
        if(Largest < Numbers[i]) {
            Largest = Numbers[i];
        }
      }        return Largest;

    }
    public static void main(String[] args) {
        int Numbers[] = {2,3,5,7,2,9,10,58};
        
        int Largestt = Largest(Numbers);
        System.out.println(Largestt);

    }
}
