public class SuperKeyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        
    }
}

class Animal{
    Animal(){
        System.out.println("Animal Constructor is Called");
    }
}

class Horse extends Animal{
    Horse(){
    super();
    System.out.println("Horse Constructor is Called");
}
}