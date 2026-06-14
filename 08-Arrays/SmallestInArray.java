public class SmallestInArray {
    public static int Smallest(int Numbers[]){
      int Smallest = Integer.MAX_VALUE;

      for(int i=0; i<Numbers.length; i++){
        if(Smallest > Numbers[i]) {
            Smallest = Numbers[i];
        }
      }        return Smallest;
    }
    
    public static void main(String[] args) {
        int Numbers[] = {2,3,5,7,2,9,10,58,1};
        
        int Smallest = Smallest(Numbers);
        System.out.println(Smallest);

    }
}
