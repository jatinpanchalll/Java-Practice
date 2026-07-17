public class IncNum{
    public static void IncNum(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        IncNum(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n = 5;
        IncNum(n);

    }
}