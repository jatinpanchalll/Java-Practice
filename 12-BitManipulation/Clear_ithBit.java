public class Clear_ithBit {
    public static int ClearithBit(int n, int i){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(ClearithBit(10, 1));
    }
}
