public class ClearLast_I_Bits {
    public static int ClearLastIBits(int n, int i){
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(ClearLastIBits(15,2));
    }
}
