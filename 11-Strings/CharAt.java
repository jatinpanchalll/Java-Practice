public class CharAt {

    public static void PrintLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        // String FirstName = "Jatin";
        // String LastName = "Panchal";


        // String FullName = FirstName +" "+ LastName ;
        // System.out.println(FullName.charAt(10));

        String str = "ABCDEGHIJKLMNOPQRSTUVWX";
        PrintLetters(str);
    }
}
