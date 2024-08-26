
import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
                          //LinkedHashSet<>(); by replacing this here, the order of the input will be maintained while still mainitaining the properties of set
                          
                          //TreeSet<>(); by replacing this here, the input elements will be sorted in order. This is implementing a BST in the backend; 7

        s.add("Kumar");
        s.add("Prajwal");
        s.add("Harshu");

        System.out.println(s);

        s.remove("Kumar")   ;
        System.out.println(s);
        
        System.out.println(s.contains("Prajwal"));
        System.out.println(s.isEmpty());

        s.add("Prajwal");
        System.out.println(s);

    }
}

//A set is a collection that does not allow duplicate elements
//The order of storage is random and is based on the hash value generated
/*
 * add()
 * remove()
 * isEmpty()
 * contains()
 */