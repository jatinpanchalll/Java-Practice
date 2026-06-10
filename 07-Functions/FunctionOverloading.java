public class FunctionOverloading {
    public static int Sum(int a, int b){
        return a+b;
    }

    public static double Sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(Sum(1.5f,1.6f));
    }
}

