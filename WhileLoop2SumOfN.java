 // SUM OF N
 import java.util.*;
 public class WhileLoop2SumOfN{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);


    int n = sc.nextInt();
    int Sum=0;
    int i=1;

    while(i <= n){
       Sum = Sum + i;
       i++;
    }
    System.out.println("sum is : " + Sum);
    }
    }
