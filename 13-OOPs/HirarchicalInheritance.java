public class HirarchicalInheritance {
    
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.breath();
        Shark.swim();

        Dog Dobby = new Dog();
        Dobby.eat();
        
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

//DERIVED CLASS A
class Fish extends Animal{

    void swim(){
        System.out.println("Swim");
    }
}

//DERIVED CLASS B
class Dog extends Animal{
    int legs;
}
