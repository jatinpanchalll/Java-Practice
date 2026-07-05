public class Abstraction {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.walk();
        D.eats();
        
        System.out.println(D.Color);
    }
}


abstract class Animal{
String Color;

    Animal(){
        Color = "Brown";
    }

     void eats(){
        System.out.println("Eats");
     }

     abstract void walk();
}

class Dog extends Animal{

    void changeColor(){
        Color = "Peach";
    }

    void walk(){
        System.out.println("Walks On 4 legs");
    }
}

class Chicken extends Animal{

    void changeColor(){
        Color = "Peach";
    }

    void walk(){
        System.out.println("Walks On 2 legs");
    }
}