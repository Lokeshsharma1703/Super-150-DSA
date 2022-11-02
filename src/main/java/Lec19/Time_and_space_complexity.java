package Lec19;
//Experimental way
public class Time_and_space_complexity {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    // it is hardware dependent
}
