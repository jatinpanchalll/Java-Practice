public class Swap {
    
    public static void Swap(int A, int B){
        int temp = A;
        A = B;
        B = temp;
        System.out.println("A Is : " + A);
        System.out.println("B Is : " + B);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Swap(a, b);
    }
}
