import java.util.*;
public class Polymorphism {
    

    //METHOD OVERLOADING
    public static int Sum(int a, int b){
        int Sum = a + b;
        return Sum;
    }

    public static float Sum(float a, float b){
        float Sum = a + b;
        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

    System.out.println(Sum(a, b));
    System.out.println(Sum(4.5f, 6.5f));


    //METHOD OVERRIDING
    Deer D = new Deer();
    D.eat();

    }
}

//METHOD OVERRIDING
class Animal {
    void eat(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
