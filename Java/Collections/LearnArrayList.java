
import java.util.ArrayList;
import java.util.Iterator;

class LearnArrayList{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Prajwal");
        names.add("Harshita");
        names.add(0,"Narendra Babu");
        names.add(1,"Manjula");

        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Parappa");

        names.addAll(0, newNames);

        System.out.println(names);

        System.out.println(names.get(1));

        names.remove(0);
        System.out.println(names);

        names.set(0,"Narendra Babu");
        System.out.println(names);

        names.add(0,"Parappa");
        System.out.println(names);

        names.remove(0); //removes the element at index 0
        names.remove(String.valueOf("Prajwal")); //Removes the element Prajwal of type String. String is the ArrayList type
        System.out.println(names);

        //To traverse;
        for (int i = 0; i < names.size(); i++) {
            System.out.println("The names of the family members are: "+names.get(i));
        }

        //for each loop   -----------------> Prefer this for performance
        for (String name : names) {
            System.out.println(name);   
        }

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            System.out.println("Iterator prints: " +it.next());
        }


        
        //ArrayList methods are: 
        /*
         * add(element)
         * add(index,element)
         * addAll(index, anotherArray) //adds at the index
         * addAll(anotherArray) //adds at end
         * get(index)
         * remove(index)
         * remove(Type.valueOf(object))
         */

         //Iterator methods are:
         /*
          * hasNext()
            next()
          */

    }
}