public class CampareLargest {
    public static void main(String args[]){
        String Fruit[] = {"apple", "mango", "banana"};
        String Largest = Fruit[0];

        for(int i=0; i<Fruit.length; i++){
           if(Largest.compareTo(Fruit[i]) < 0){
               Largest = Fruit[i];
           }
        }
        System.out.println(Largest);
    }
}
