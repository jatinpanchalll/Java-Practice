public class ClearBitsInRange {
    public static int ClearBitsInRange(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int BitMask = a | b;
        return  n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(ClearBitsInRange(10, 2, 4));
    }
}
