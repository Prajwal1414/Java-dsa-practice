import java.util.Scanner;

public class Armstrong {
	
	
    public static boolean isArmstrong(int n){
        int x = n;
        int sum = 0;
        int Count = (n == 0)? 1: (int)Math.log10(n)+1;
        
        
        while(x > 0){
            int currentNum = x % 10;
            sum = sum + (int) Math.pow(currentNum, Count);
            x = x / 10;
            
        }
        return n == sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            boolean flag = isArmstrong(n);
            //    if(flag) System.out.println("It is an armstrong number");
            //    else System.out.println("It is not an armstrong number");
            System.out.println(flag);
        }
    }
}
