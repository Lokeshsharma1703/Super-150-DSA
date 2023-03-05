package Lec40;

public class HashMap_Client {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Riya", 89);
        mp.put("Nitish", 77);
        mp.put("Akash", 67);
        mp.put("Zaid", 76);
        mp.put("Omika", 90);
        mp.put("Puneet", 77);
        System.out.println(mp);
//        mp.put("Zaid", 7);
//        System.out.println(mp);
//        System.out.println(mp.get("Raj"));
//        System.out.println(mp.get("Akash"));
//        System.out.println(mp.containsKey("Raj"));
//        System.out.println(mp.containsKey("Zaid"));
        mp.remove("Riya");
        System.out.println(mp);
    }
}
