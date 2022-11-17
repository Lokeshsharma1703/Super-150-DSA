package Lec23;

import Lec22.Student;

public class Student_Client {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Kunal", 24);
        s.setAge(-9);
        System.out.println(s.getAge());
    }
}
