public class CopyConstructor {
    public static void main(String[] args) {
        StudentJatin s1 = new StudentJatin();
        s1.Name = "Jatin";
        s1.roll = 49;
        s1.Password = "abcd";

        StudentJatin s2 = new StudentJatin(s1);
        s2.Name = s1.Name;
        s2.roll = s1.roll;
        s2.Password = "xyz";

        System.out.println(s1.Name + " " + s1.roll + " " + s1.Password);
        System.out.println(s2.Name + " " + s2.roll + " " + s2.Password);
    }
}

class StudentJatin{
    String Name;
    int roll;
    String Password;

    StudentJatin(){

    }
    
    //SHALLOW COPY
    StudentJatin(StudentJatin s1){
      this.Name = s1.Name;
      this.roll = s1.roll;
    }
}
