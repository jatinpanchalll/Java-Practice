public class ClassAndObjects{
    public static void main(String args[]){

        Pen p1 = new Pen();              //OBJECT
        p1.setColor("Blue");   //FUNCTION / METHOD CALLING
        System.out.println(p1.Color);

        p1.setTip(8);           //FUNCTION / METHOD CALLING
        System.out.println(p1.Tip);

        Student s1 = new Student();     //OBJECT
        s1.setName("Jatin");   //FUNCTION / METHOD CALLING
        System.out.println(s1.Name);

        s1.setGrade("7th");   //FUNTION / METHOD CALLING
        System.out.println(s1.Grade);

    }
}

class Pen {             //CLASS PEN
    String Color;       // PROPERTY
    int Tip;            // PROPERTY

    void setColor(String newColor){ //FUNCTION
        Color = newColor;
    }

    void setTip(int newTip){ //FUNCTION
        Tip = newTip;
    }
}

class Student {        //STUDENT
    String Name;       // PROPERTY
    String Grade;      // PROPERTY

    void setName(String newName){ //FUNCTION
        Name = newName;
    }

    void setGrade(String newGrade){ //FUNCTION
        Grade = newGrade;
    }
}