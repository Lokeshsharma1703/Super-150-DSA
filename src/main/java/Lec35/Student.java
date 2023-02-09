package Lec35;

public class Student implements Comparable<Student> {
    String Name;
    int age;
    Student(){}
    Student(String name, int age){
        this.Name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "["+this.Name+", "+this.age+"]";
    }

    @Override
    public int compareTo(Student o){
        return this.age - o.age;
    }
}
