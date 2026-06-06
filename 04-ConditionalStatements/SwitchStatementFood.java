 // SWITCH STATEMENTS
 // FOOD
 import java.util.*;
 public class SwitchStatementFood {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();


        switch(Number){
            case 1:System.out.println("Samosa");
                      break;
            case 2:System.out.println("Burger");
                      break;
            case 3:System.out.println("Kachori");
                      break;
            default:System.out.println("NOthing To Eat");
        }
    }
    }
