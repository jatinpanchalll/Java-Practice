import java.util.Scanner;

public class PrimeInRange {


    public static boolean IsPrime(int n){

        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<n; i++){
        System.out.println(i + "Is" + IsPrime(i));
        }
    }

    }

    

