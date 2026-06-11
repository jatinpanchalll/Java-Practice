public class CallByRefrence {
    public static void update(int marks[]){
       for(int i=0; i<marks.length; i++){
        marks[i] = marks[i] + 1;
        System.out.println(marks[i]);
       }
    }

    public static void main(String[] args) {
        int marks[] = {99, 99, 99};
        update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
