public class Prime{
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1; i * i <= n ; i++){
            if(n % i == 0 ) count++;
            if(n / i != i) count++;
        }
        return count == 2;
    }
    public static void main(String[] args) {
        if(isPrime(1))
            System.out.println("YES");
        else    
            System.out.println("NO");
    }
}