package Lec39;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Riya", 89);   // O(1)
        mp.put("Nitish", 77);
        mp.put("Akash", 67);
        mp.put("Zaid", 76);
        mp.put("Omika", 90);
        mp.put("Puneet", 77);
//        System.out.println(mp);
        mp.put("Akash", 85);
//        System.out.println(mp);

        // print-----------
        // way 1
//        Set<String> key = mp.keySet();
//        System.out.println(key);
//        for(String k : key){
//            System.out.println(k +" "+mp.get(k));
//        }

        // way 2
//        for(String k : mp.keySet()){
//            System.out.println(k+" "+mp.get(k));
//        }

        // way 3
//        ArrayList<String> list = new ArrayList<>(mp.keySet());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i)+" "+mp.get(list.get(i)));
//        }



//        System.out.println(mp.get("Zaid"));  // O(1)
//        System.out.println(mp.get("Raj"));

//        System.out.println(mp.containsKey("Zaid"));
//        System.out.println(mp.containsKey("Hari"));

//        System.out.println(mp.remove("Nitish"));  // returns value
//        System.out.println(mp);


//        TreeMap<String, Integer> tm = new TreeMap<>();  // All operations performed in O(log N)
//        tm.put("Riya", 89);
//        tm.put("Nitish", 77);
//        tm.put("Akash", 67);
//        tm.put("Zaid", 76);
//        tm.put("Omika", 90);
//        tm.put("Puneet", 77);
//        System.out.println(tm);


//        LinkedHashMap<String, Integer> lmp = new LinkedHashMap<>();  // All operations performed in O(1), insertion order maintains, uses doubly linkedList
//        lmp.put("Riya", 89);
//        lmp.put("Nitish", 77);
//        lmp.put("Akash", 67);
//        lmp.put("Zaid", 76);
//        lmp.put("Omika", 90);
//        lmp.put("Puneet", 77);
//        System.out.println(lmp);
    }
}
