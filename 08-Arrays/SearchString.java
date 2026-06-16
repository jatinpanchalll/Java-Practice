public class SearchString {

    public static void main(String[] args) {

        String names[] = {"Jatin", "Rahul", "Aman", "Rohit"};
        String key = "Aman";

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("String Found");
        } else {
            System.out.println("String Not Found");
        }
    }
}