public class FuntionOverloadingParameter {
    
    public static int Sum(int a, int b){
        return a+b;
    }

    public static int Sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(Sum(5, 10));
        System.out.println(Sum(5, 5, 5));

    }
}
