import java.util.Arrays;

public class LearnArraysClass{
    public static void main(String[] args) {
        
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(num, 4);

        System.out.println("The key 4 is present at position " +index);

        int unsortedNums[] = {4,5,1,7,3,8};
        
        Arrays.sort(unsortedNums);
        System.out.println(Arrays.toString(unsortedNums));
    }
}