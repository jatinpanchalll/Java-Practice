public class StaticKeyword {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.Name = "Jatin";
        System.out.println(S1.Name);

        S1.SchoolName = "JMV";
        System.out.println(S1.SchoolName);

        Student S2 = new Student();
        System.out.println(S2.SchoolName);
    }
}

class Student{
    String Name;
    String rollno;
    static String SchoolName;

    void setName(){
        this.Name = Name;
    }

    String getName(){
        return this.Name;
    }
}
