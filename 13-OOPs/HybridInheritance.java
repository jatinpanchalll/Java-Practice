public class HybridInheritance {
    public static void main(String[] args) {

        Tuna t1 = new Tuna();
        t1.eat();
        t1.swim();

        Shark s1 = new Shark();
        s1.eat();
        s1.swim();

        Peacock p1 = new Peacock();
        p1.eat();
        p1.fly();

        Dog d1 = new Dog();
        d1.eat();
        d1.walk();

        Cat c1 = new Cat();
        c1.eat();
        c1.walk();

        Human h1 = new Human();
        h1.eat();
        h1.walk();
    }
}

// Base Class
class Animal {
    void eat() {
        System.out.println("Animal Eats");
    }
}

// Level 1 Classes
class Fish extends Animal {
    void swim() {
        System.out.println("Can Swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Can Fly");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Can Walk");
    }
}

// Level 2 Classes
class Tuna extends Fish {

}

class Shark extends Fish {

}

class Peacock extends Bird {

}

class Dog extends Mammal {

}

class Cat extends Mammal {

}

class Human extends Mammal {

}