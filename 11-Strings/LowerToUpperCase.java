public class LowerToUpperCase {

    public static String LowerToUpper(String str){
        StringBuilder sb = new StringBuilder("");

        Character ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
           return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am jatin";
        System.out.println(LowerToUpper(str));
        
    }
}
