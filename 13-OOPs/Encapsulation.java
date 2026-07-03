public class Encapsulation {
    public static void main(String[] args) {

        Studenttt s1 = new Studenttt();

        s1.setName("Jatin");
        System.out.println(s1.getName());
    }
}

class Studenttt {

    private String name;

    // Setter
    public void setName(String newName) {
        name = newName;
    }

    // Getter
    public String getName() {
        return name;
    }
}