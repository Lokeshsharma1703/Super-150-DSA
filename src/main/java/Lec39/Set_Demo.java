package Lec39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();  // All operation O(1)
        st.add(-90);
        st.add(78);
        st.add(45);
        st.add(79);
        st.add(78);
        st.add(23);
        st.add(null);
//        System.out.println(st);
//        System.out.println(st.remove(123));
//        System.out.println(st.remove(45));
//        System.out.println(st);

//        System.out.println(st.contains(79));

        TreeSet<Integer> ts = new TreeSet<>(); // All operations O(log N)
//        sorted order
        ts.add(-90);
        ts.add(78);
        ts.add(45);
        ts.add(79);
        ts.add(78);
        ts.add(23);
//        ts.add(null); // error
//        System.out.println(ts);


        LinkedHashSet<Integer> ls = new LinkedHashSet<>(); // All operations O(1), insertion order maintains
        ls.add(-90);
        ls.add(78);
        ls.add(45);
        ls.add(79);
        ls.add(78);
        ls.add(23);
        ls.add(null);
        System.out.println(ls);
    }
}
