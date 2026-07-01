public class CheckOddEven {

    public static void OddOrEven(int n){
        int BitMask = 1;

        if((n & BitMask) == 0){
           //EVEN
           System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
    public static void main(String[] args) {
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(4);
    }
}
