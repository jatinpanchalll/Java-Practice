public class PracticeQuestion10 {

    public static void BineryToDecimal(int binery){
        int decimal = 0, base = 1, rem = 0;

        while (binery > 0) {
            rem = binery % 10;
            decimal = decimal + rem * base;
            base = base * 2;
            binery = binery / 10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        BineryToDecimal(1011);
    }
}
