public class Inheritance{
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.breath();
        Shark.swim();
    }
}

//BASE CLASS
class Animal{

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("Breath");
    }
}

//DERIVED CLASS
class Fish extends Animal{

    void swim(){
        System.out.println("Swim");
    }
}