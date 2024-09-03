//GCD(a,b) = GCD(a - b, b), where a > b;
//It can be rewritten as GCD(a,b) = GCD(a % b, b), where a > b;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
         int a = sc.nextInt();
         int b = sc.nextInt();
         
         while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
         }
         if(a == 0 ) System.out.println(b);
         else System.out.println(a);
       }

    }

}
