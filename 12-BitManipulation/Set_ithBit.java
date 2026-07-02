public class Set_ithBit {

    public static int SetithBit(int n, int i){
        int BitMask = 1<<i;
        return n | BitMask;
    }
    public static void main(String[] args) {
        System.out.println(SetithBit(10, 2));
    }
}