public class StringBuilderr{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char i='A'; i<='Z'; i++){
            sb.append(i);
        }

        System.out.println(sb);
}
}