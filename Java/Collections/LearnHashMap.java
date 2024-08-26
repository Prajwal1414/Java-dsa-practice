
import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
                                          //TreesMap This will just sort the map based on the key

        countries.put("USA","United States Of America");
        countries.put("IND","India");
        countries.put("BR","Brazil");

        System.out.println(countries);

        System.out.println("Does the hashMap contain the key IND? " + countries.containsKey("IND") );
        System.out.println("Does the hashMap contain the value Australia? " + countries.containsValue("Australia") );
        System.out.println("Is the hashMap empty? " + countries.isEmpty());
        // System.out.println(countries.clear());   //This clears the hashMap; 

        countries.putIfAbsent("USA", "United States");
        

        // for (Map.Entry<String, String> e : countries.entrySet()) {    //Intellisense autocompletes this 
           
        //    //This is good for iterating throught the map for both key and values

        //    System.out.println(e.getKey());
        //    System.out.println(e.getValue());
            
        // }

        countries.remove("USA");
        System.out.println(countries);

        //This is good for iterating only keys
        for(String key : countries.keySet()){
            System.out.println(key);
        }
        //This is good for iterating values only
        for(String val : countries.values())
            System.out.println(val);

    }
}

/*
 * put(key,value)
 * putIfAbsent(key,value)
 * remove(key)
 * containsKey(key)
 * containsValue(value)
 * keySet() //for iterating keys
 * values() //for iterating values
 * Order is based on the hash generated for the keys
 * 
 */