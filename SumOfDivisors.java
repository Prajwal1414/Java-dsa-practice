public class SumOfDivisors {

    public static int sumOf(int n){
        int sum = 0;
        for (int i = 1; i * i<= n; i++) {
            if(n % i == 0 ){
                sum += i;
                if(n / i != i)
                    sum += n/i;
            }
        }
        return sum;
    }

    public static int totalSumOf(int n){
        int totalSum = 0;
        for (int i = 1; i <= n; i++) 
            
            totalSum += sumOf(i);
            
        
        return totalSum;
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The sum of divisors of "+n+" is: " + totalSumOf(n));
        
    }
}
