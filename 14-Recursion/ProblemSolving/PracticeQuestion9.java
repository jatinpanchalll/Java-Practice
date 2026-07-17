public class PracticeQuestion9 {
    public static void Kadens(int Array[]){
        int currsum=0;
            int MaxSum = 0;

        for(int i=0; i<Array.length; i++){

            if(i < 0){
                i=0;
            }

            MaxSum += Array[i];
        }
        System.out.println("Max Sum Is:" + MaxSum);
        
      
    }
    public static void main(String[] args) {
        int Array[] = {2,4,6,8,10};      
        Kadens(Array);         

    }
}
