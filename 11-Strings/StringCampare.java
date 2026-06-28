public class StringCampare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 ="Tony";
        String s3 = new String("Tony");

        if (s1.equals(s3)) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

          if (s1.equals(s2)) {
            System.out.print(true);
        }
        else{
            System.out.println(false);
        }
    }
}

