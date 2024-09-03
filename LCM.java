import java.util.Scanner;

public class LCM {
    public static int lcm(int a, int b){
        return (a * b) / (gcd(a,b));
    }

    public static int gcd(int a, int b){
        while(a > 0 && b > 0){
            if(a > b ) a = a % b;
            else b = b % a;
        }
        if(a == 0 ) return b;
        else return a;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = lcm(a, b);
            int g = gcd(a, b);
            System.out.println(l+" "+g);
        }
    }
}
