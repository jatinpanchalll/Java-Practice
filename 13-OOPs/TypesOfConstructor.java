public class TypesOfConstructor {
    public static void main(String[] args) {

        Studentttt s1 = new Studentttt(); //NON_PARAMETERIZED

        Studentttt s2 = new Studentttt("Jatin", 49); //PARMETERIZED
        System.out.print(s2.Name);
        System.out.println(s2.roll);

        Studentttt s3 = new Studentttt(49);
        System.out.println(s3.roll);

        
    }
}

class Studentttt{
    String Name;
    int roll;

    Studentttt(){
        System.out.println("constructor is called");
    }

    Studentttt(String Name, int roll){
        this.Name = Name;
        this.roll = roll;
    }

    Studentttt(int roll){
        this.roll = roll;
    }
}
