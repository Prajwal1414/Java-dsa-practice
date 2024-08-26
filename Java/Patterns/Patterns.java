
import java.util.Scanner;


public class Patterns {
    
    public static void nForest(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void nBy2Forest(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void seeding(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pyramid(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++)  //Print spaces
                System.out.print(" ");

            for(int j = 0; j < 2*i + 1; j++)
                System.out.print("*"); //Print stars

            // for(int j = 0; j < n-i; j++)  //Print spaces
            //     System.out.print(" ");
            System.out.println();
        
        }
    }   

    public static void reversePyramid(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++)  //Printing spaces
                System.out.print(" ");

            for(int j = 0 ; j < 2*n - (2*i+1) ; j++)  //
                System.out.print("*");

            // for(int j = 0; j < i; j++)  //Printing spaces
            //     System.out.print(" ");

            System.out.println();
            }
        }

        public static void comboPyramid(int n){
                pyramid(n); 
                reversePyramid(n);
        }

        public static void comboTriangle(int n){
            nBy2Forest(n);
            seeding(n-1);
        }

        public static void nBinaryTriangle(int n){
            int start = 1;

            
            for(int i = 0; i < n; i++){
                
                if (i % 2 == 0) start = 1;
                else start = 0;
                
                for(int j = 0; j < i + 1; j++){
                    System.out.print(start);
                    start = 1 - start;
                }
                System.out.println();
            }
        }

        public static void numberCrown(int n){
            for(int i = 0 ; i < n; i++){
                for(int j = 0 ; j < i + 1; j++)
                    System.out.print(j+1);

                for(int j = 0; j < 2*(n-1) - (2*i); j++)
                    System.out.print(" ");
                
                for(int j = i + 1 ; j > 0; j--)
                    System.out.print(j);
            
            System.out.println();
            }
        }
        

    public static void nNumberTriangle(int n){
        int num = 1;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }
  
    public static void alphaRightTriangle(int n){
        char alpha = 'A';
        for ( int i = 0 ; i < n; i++){
            for(int j = 0 ; j < i + 1; j++){
                
                System.out.print(alpha);
                
            }
            alpha += 1;
            System.out.println();
        }
    }

    public static void alphaReverseTriangle(int n){
        for(int i = 0 ; i < n; i++){
            char alpha = 'A';
            for(int j = 0; j < n-i; j++){
                System.out.print(alpha);
                alpha += 1;

            }
            System.out.println();
        }
    }

    public static void alphaPyramid(int n){
        for(int i = 0; i < n; i++){
            char alpha = 'A';
            int breakpoint = (2 * i + 1)/2;
            //spaces
            for(int j = 0 ; j < n - i - 1; j++)
                System.out.print(" ");
            
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print(alpha);
                if (j < breakpoint) alpha += 1;
                else alpha -= 1;

            }

           
            System.out.println();
                
            
        }
    }

    public static void reverseAlphaTriangle(int n){
        for (int i = 0; i < n; i++) {
            char startChar = (char) ('A' + n - 1 - i); // Starting character for each row

            // Print characters in increasing order starting from startChar
            for (int j = 0; j <= i; j++) {
                System.out.print(startChar);
                startChar += 1;
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void pattern19(int n){
        for(int i = 0; i < n; i++){ //top half
            for (int j = 0; j < n - i ; j++)
                System.out.print("*");
            
            for(int j = 0 ; j < 2*i; j++)
                System.out.print(" ");
            
            for( int j = 0; j < n-i; j++)   
                System.out.print("*");
            
            System.out.println();
            }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i + 1 ; j++)
                System.out.print("*");
            
            for(int j = 0 ; j < 2* (n-1) - (2*i); j++)
                System.out.print(" ");
            
            for(int j = 0 ; j < i + 1 ; j++)
                System.out.print("*");
            
            System.out.println();
        }

        
    }

    public static void symmetry(int n){
        int spaces = 2*n - 2;
        for (int i = 0; i < 2* n -1; i++) {
            int stars = i;
            if (i >= n ) stars = (2 * n) - i - 2;

            for (int j = 0; j <= stars; j++) //stars
                System.out.print("*");
                
            for(int j = 0; j < spaces; j ++)
                System.out.print("-");    
                
            for (int j = 0; j <= stars; j++) //stars
                System.out.print("*");
            
        if( i < n - 1) spaces -= 2;
        else spaces +=2; 
        System.out.println();
        }
        
            
            
            


    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        Integer n = sc.nextInt();
        // nForest(n);
        // nBy2Forest(n);
        // seeding(n);
        // pyramid(n);
        // reversePyramid(n);
        // comboPyramid(n);
        // comboTriangle(n);
        // nBinaryTriangle(n);
        // numberCrown(n);
        // nNumberTriangle(n);
        // alphaRightTriangle(n);
        // alphaReverseTriangle(n);
        // alphaPyramid(n);
        // reverseAlphaTriangle(n);
        // pattern19(n);
        symmetry(n);



        sc.close();
        
    }
}
