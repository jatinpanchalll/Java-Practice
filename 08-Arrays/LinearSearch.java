public class LinearSearch {
    public static int Linear(int Numbers[], int key){
        for(int i=0; i<Numbers.length; i++){
            if(Numbers[i] == key){
              return i;
            }
        }
        return -1;
    }            

    public static void main(String[] args) {
        int Numbers[] = {1,2,3,4,5,6,7,8};
        int key = 6;

        int index = Linear(Numbers, key);
        if(index == -1){
            System.out.println("Key Is Not Found");
        }else{
            System.out.println("Key Found at index : " + index);
        }
    }

}
