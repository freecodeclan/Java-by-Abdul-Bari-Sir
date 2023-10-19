package Map;

import java.util.*;

public class HashmapDemo {

    static void HashMapMethod(){
        //--Object of an HashMap
        Map<String,Integer> mp = new HashMap<>();

        mp.put("Akash", 21);        //-- ( .put() ) is used to add enteries into an HashMap
        mp.put("Harsh", 31);
        mp.put("Juhi", 28);
        mp.put("Vandana", 27);
        mp.put("Gaurav", 33);

        System.out.println(mp);
        System.out.println(mp.get("Harsh"));
        System.out.println(mp.containsKey("Juhi"));
        System.out.println(mp.size());
        System.out.println(mp.put("Gaurav", 30));
        System.out.println(mp);
        System.out.println(mp.keySet());       //-- Gives all the keys present in map
        System.out.println(mp.entrySet());      //-- Give all the entries with key and values 

    }
    public static void main(String[] args) {
        HashMapMethod();
    }
}
