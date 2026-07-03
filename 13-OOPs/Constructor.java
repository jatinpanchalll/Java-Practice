public class Constructor {
    public static void main(String[] args) {
        Studentt s1 = new Studentt("Jatin", 49);
        System.out.println(s1.Name);
        System.out.println(s1.roll);
    }
}

class Studentt{
    String Name;
    int roll;

    Studentt(String Name, int roll){
        this.Name = Name;
        this.roll = roll;
    }
}

