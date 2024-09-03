
import java.util.ArrayList;

// Sum of all divisors from 1 to n
// Difficulty: EasyAccuracy: 43.37%Submissions: 148K+Points: 2
// Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.
// import java.util.Scanner;
public class Divisors {
    public static int findDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0){
                list.add(i);
                if(n / i != i) 
                    list.add(n/i);
            }
        }
        list.sort(null);
        for(Integer num : list)
            System.out.print(num + " ");
        return sum;
    }

        public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            int n = 36;
            findDivisors(n);
            // sc.close();
        
        }


}

