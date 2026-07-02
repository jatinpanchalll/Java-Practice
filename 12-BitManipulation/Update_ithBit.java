public class Update_ithBit {
    public static int ClearithBit(int n, int i){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }

    public static int UpdateithBit(int n, int i, int NewBit){
        n = ClearithBit(n, i);
        int BitMask = NewBit << i;
        return n|BitMask;
    }

    public static void main(String[] args) {
        System.out.println(UpdateithBit(10, 2,1));
    }
}


