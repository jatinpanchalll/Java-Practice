public class StringReverse {
    
    public static void Reverse(String Array[]) {
        int First = 0, Last = Array.length - 1;

        while (First < Last) {
            String temp = Array[First];
            Array[First] = Array[Last];
            Array[Last] = temp;

            First++;
            Last--;
        }
    }

    public static void main(String[] args) {
        String Array[] = {"Java", "HTML", "CSS", "JavaScript", "Python"};

        Reverse(Array);

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}