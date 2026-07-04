public class MultiLevelInheritqance {

    public static void main(String[] args) {
        Dog Dobby = new Dog();
        Dobby.eat();
        Dobby.breath();
        Dobby.legs = 4;
        System.out.println(Dobby.legs);
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
class Mammal extends Animal{
    int legs;
}

//DERIVED CLASS
class Dog extends Mammal{
      
}