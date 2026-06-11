public class ReverseAnArray {
    public static void Reverse(int Array[]){
        int First = 0, Last=Array.length-1;

        while (First < Last) {
            int temp = Array[First];
            Array[First] = Array[Last];
            Array[Last] = temp;

            First++;
            Last--;
        }
    }
    public static void main(String[] args) {
        int Array[] = {2,4,5,6,8,9,7,8,6};
    
        Reverse(Array);
        for(int i=0; i<Array.length; i++){
            System.out.print(Array[i]);
            System.out.print(" ");
        }

    }
}
